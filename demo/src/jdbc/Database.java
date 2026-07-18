package jdbc;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection getConnection() throws Exception {
		var database = "c:/classroom/jun15j/payroll.db";
		var databasePath = Path.of(database);
		if (!Files.exists(databasePath))
			throw new FileNotFoundException(database + " not found!");

		String url = "jdbc:sqlite:" + database;

		Connection con = DriverManager.getConnection(url);
	    return con;
	}
}
