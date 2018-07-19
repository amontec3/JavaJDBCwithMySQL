package com.java.jdbc.statement;

import java.sql.SQLException;

public interface SQLStatement {
	
	void selectStatementForActor() throws SQLException;
	void selectOnlyNameFromActor() throws SQLException;
	
	void deleteFromActor(int id) throws SQLException;
	void updateFLFromActor(int id, String fn,String ln) throws SQLException;
	void insertIntoActor(int id, String fn, String ln, String ts) throws SQLException;


}
