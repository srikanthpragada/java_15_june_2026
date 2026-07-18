package jdbc;

import java.sql.Connection;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class DeptSummary {

	public static void main(String[] args) {

		String sql_command = 
				"""
				select dept_name, sum(emp_salary) as total_salary 
                from employees join departments on employees.EMP_DEPT_ID = departments.DEPT_ID
				group by dept_name
			    """;

		try (Connection conn = Database.getConnection()) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand(sql_command);
			rowSet.execute(conn); // link with connection and execute SQL
			
			while (rowSet.next()) {
	            String dept_name = rowSet.getString("dept_name");
	            int total_salary = rowSet.getInt("total_salary");
	            System.out.printf("%-30s  %8d\n", dept_name, total_salary);
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
