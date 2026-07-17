package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		String url = "jdbc:sqlite:c:/classroom/jun15j/payroll.db";

		try (Connection con = DriverManager.getConnection(url)) {
			System.out.println(con.getClass());
			System.out.println("Connected Successfully!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
