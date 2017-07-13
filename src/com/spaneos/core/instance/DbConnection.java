package com.spaneos.core.instance;

public class DbConnection {

	private static DbConnection dbConnection=new DbConnection();
	
	public static DbConnection getDbConnection() {
		System.out.println(" Static method is invoked");
		return dbConnection;
	}

	private DbConnection(){}
	
}
