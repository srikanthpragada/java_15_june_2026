package jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class AddDepartment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try (Connection conn = Database.getConnection()) {
			System.out.print("Enter department id   :");
			var id = s.nextLine();
			System.out.print("Enter department name :");
			var name = s.nextLine();
			
			var ps = conn.prepareStatement
					  ("insert into departments (dept_id, dept_name) values(?, ?)");
			ps.setString(1, id);
			ps.setString(2, name);
			int count = ps.executeUpdate();
			if (count == 1)
			    System.out.println("Added Department Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		s.close();
	}

}
