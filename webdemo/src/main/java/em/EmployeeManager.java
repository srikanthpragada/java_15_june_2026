package em;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class EmployeeManager {
 
	public static Connection getConnection() throws Exception {
		Class.forName("org.sqlite.JDBC");  // load driver class 
		var database = "c:/classroom/jun15j/payroll.db";
		var databasePath = Path.of(database);
		if (!Files.exists(databasePath))
			throw new FileNotFoundException(database + " not found!");

		String url = "jdbc:sqlite:" + database;

		Connection con = DriverManager.getConnection(url);
		return con;
	}

	public static CachedRowSet getEmployees() throws Exception {

		try (Connection conn = getConnection()) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand("select * from employees");
			rowSet.execute(conn); // link with connection and execute SQL

			return rowSet;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static CachedRowSet getEmployee(int id) throws Exception {

		try (Connection conn = getConnection()) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand("select * from employees where emp_id = ?");
			rowSet.setInt(1, id);
			rowSet.execute(conn); // link with connection and execute SQL

			return rowSet;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static CachedRowSet getSummary() throws Exception {

		try (Connection conn = getConnection()) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand("select count(*) employeeCount, avg(emp_salary) averageSalary from employees");
			rowSet.execute(conn); // link with connection and execute SQL
			return rowSet;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Exception addEmployee(String name, String job, String dept, int salary) {
		try (Connection conn = getConnection()) {

			var ps = conn.prepareStatement(
					"insert into employees (emp_name, emp_job, emp_dept_id, emp_salary) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, job);
			ps.setString(3, dept);
			ps.setInt(4, salary);
			ps.executeUpdate();
			return null;   // on success 
		} catch (Exception e) {
			e.printStackTrace();
			return e;  // on error 
		}

	}

	public static Exception updateEmployee(int id, String name, String job, String dept, int salary) {
		try (Connection conn = getConnection()) {

			var ps = conn.prepareStatement(
					"update employees set emp_name = ?, emp_job =?, emp_dept_id = ?, emp_salary = ? where emp_id = ?");
			ps.setString(1, name);
			ps.setString(2, job);
			ps.setString(3, dept);
			ps.setInt(4, salary);
			ps.setInt(5, id);
			int count = ps.executeUpdate();
			if (count == 1)
			      return null;
			else
				 throw new IllegalArgumentException("Invalid Employee Id");
		} catch (Exception e) {
			e.printStackTrace();
			return e;
		}
	} // updateEmployee
	
	
	public static Exception deleteEmployee(int id) {
		try (Connection conn = getConnection()) {

			var ps = conn.prepareStatement(
					"delete from employees where emp_id = ?");
			ps.setInt(1, id);
			 
			int count = ps.executeUpdate();
			if (count == 1)
			      return null;
			else
				 throw new IllegalArgumentException("Invalid Employee Id");
		} catch (Exception e) {
			e.printStackTrace();
			return e;
		}
	} // deleteEmployee
		
}
