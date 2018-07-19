package com.java.jdbc.statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.jdbc.connection.DBConnection;
import com.java.jdbc.connection.DataBaseConnection;

public class SelectStatement implements SQLStatement {

	Statement smt;

	public void selectStatementForActor() throws SQLException {

		DBConnection con = new DataBaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "Select * From actor;";

		ResultSet rs = smt.executeQuery(sql);

		while (rs.next()) {
			int id = rs.getInt("actor_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String last = rs.getString("last_update");

			System.out.print("ID: " + id);
			System.out.print(", First Name : " + firstName);
			System.out.print(", Last Name: " + lastName);
			System.out.println(", Last Update: " + last);

		}
		rs.close();
		smt.close();
		con.connect().close();

	}

	public void selectOnlyNameFromActor() throws SQLException {

		DBConnection con = new DataBaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "Select first_name,last_name From actor;";

		ResultSet rs = smt.executeQuery(sql);

		while (rs.next()) {

			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");

			System.out.print("\n First Name : " + firstName);
			System.out.print("	\t Last Name: " + lastName);

		}
		rs.close();
		smt.close();
		con.connect().close();

	}

	@Override
	public void deleteFromActor(int id) throws SQLException {
		// TODO Auto-generated method stub
		DBConnection con = new DataBaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "DELETE FROM actor WHERE actor_id='" + id + "'";//"DELETE FROM actor WHERE actor_id='8'";
		smt.executeUpdate(sql);

		smt.close();
		con.connect().close();
		System.out.println("Successfuly deleted row entry");
	}

	@Override
	public void updateFLFromActor(int id, String fn, String ln) throws SQLException {
		// TODO Auto-generated method stub
		DBConnection con = new DataBaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		//UPDATE `dvdrental`.`actor` SET `first_name`='JJJ', `last_name`='KKKK' WHERE `actor_id`='8';

		String sql = "UPDATE actor SET `first_name`='"+fn+"', `last_name`='"+ln+"' WHERE `actor_id`='"+id+"'";
		smt.executeUpdate(sql);

		smt.close();
		con.connect().close();
		System.out.println("Successfuly update first and last name in row entry");
	}

	@Override
	public void insertIntoActor(int id, String fn, String ln, String ts) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		DBConnection con = new DataBaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "INSERT INTO actor VALUES ('"+id+"','"+fn+"','"+ln+"','"+ts+"')";
		smt.executeUpdate(sql);
		smt.close();
		con.connect().close();
		System.out.println("Successfuly inserted row entry");
	}

}
