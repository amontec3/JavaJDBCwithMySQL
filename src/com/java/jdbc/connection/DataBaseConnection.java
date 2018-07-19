package com.java.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection implements DBConnection {

	private final String url = "jdbc:mysql://localhost:3306/dvdrental?serverTimezone=UTC&autoReconnect=true&useSSL=false";
	private final String user = "student";
	private final String password = "student";

	public Connection connect() throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("\nConnected to the PostgreSQL server successfully.");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}


		return conn;
	}

}
