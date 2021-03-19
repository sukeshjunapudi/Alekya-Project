 package com.vtalent.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	static Connection con;//we can access any were so keeping conection as static
	static MySqlConnection mysqlConnection = new MySqlConnection();////with out static it will be stack overflow
	
	private MySqlConnection() {//Class must be a private constructor, so that noone  will not have any access to create the object. 
		//We must create a static method which it should return the instance.
		try {
			Class.forName("com.mysql.jdbc.Driver");//this is one way to create object here we are passing external jar class name with package
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/regidb?characterEncoding=latin1", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static Connection getInstance() {//annitlo vadkodanki means we can access any where

		return con;
	}
	public static void main(String[] args) {
		System.out.println(con);
	}

}


