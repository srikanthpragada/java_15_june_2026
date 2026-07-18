package jdbc;

import java.sql.Connection;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class ListEmployees {

	public static void main(String[] args) {

		try (Connection conn = Database.getConnection()) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand("select emp_id, emp_name, emp_salary, emp_salary * 0.10 as bonus from employees");
			rowSet.execute(conn); // link with connection and execute SQL
			
			while (rowSet.next()) {
	            int id = rowSet.getInt("emp_id");
	            String name = rowSet.getString("emp_name");
	            int salary = rowSet.getInt("emp_salary");
	            double bonus = rowSet.getDouble("bonus");
	            System.out.printf("%2d  %-20s  %8d  %6.0f\n", id, name, salary, bonus);
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
