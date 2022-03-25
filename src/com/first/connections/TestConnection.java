package com.first.connections;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestConnection {

	public static Connection getConnection(){

		String user = "root";
		String pw = "root";
		String url = "jdbc:mysql://localhost:3306/test";
		String driverClass = "com.mysql.jdbc.Driver";
		Connection con = null;

		

			try {
				Class.forName(driverClass);
				con = DriverManager.getConnection(url, user, pw);
				System.out.println("connection success "+con);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//System.out.println("connection success "+con);

		return con;
	}

	public static void main(String[] args){

		getConnection();
		

	}
}
