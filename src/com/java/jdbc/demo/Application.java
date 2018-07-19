package com.java.jdbc.demo;

import java.sql.SQLException;

import com.java.jdbc.statement.SQLStatement;
import com.java.jdbc.statement.SelectStatement;

public class Application {

	public static void main(String[] args) throws SQLException {
		
		SQLStatement select = new SelectStatement();
		select.selectStatementForActor();
		select.selectOnlyNameFromActor();
		select.deleteFromActor(8);
		select.insertIntoActor(8,"Jin", "Jan", "2013-05-26 14:47:57:62");
		//select.updateFLFromActor(8, "JJJ", "LLL");
		//select.updateFLFromActor(8,"Jin", "Jan");

		select.selectStatementForActor();

	}

}
