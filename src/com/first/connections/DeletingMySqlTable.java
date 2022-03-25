package com.first.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DeletingMySqlTable {
	
	   public static void main(String[] args) {
	       Connection conn = null;
	      Statement stmt = null;
	       try {
	          try {
	             Class.forName("com.mysql.jdbc.Driver");
	          } catch (Exception e) {
	             System.out.println(e);
	          }
	          conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	          System.out.println("Connection is created successfully:");
	          stmt = (Statement) conn.createStatement();
	          String query1 = "delete from  febemployee where email=ra";
	          int count = stmt.executeUpdate(query1);
	          System.out.println("Record is deleted from the table successfully.................." +count);
	       } catch (SQLException excep) {
	          excep.printStackTrace();
	       } catch (Exception excep) {
	          excep.printStackTrace();
	       } finally {
	          try {
	             if (stmt != null)
	             conn.close();
	          } catch (SQLException se) {}
	          try {
	             if (conn != null)
	             conn.close();
	          } catch (SQLException se) {
	             se.printStackTrace();
	          }
	       }
	       System.out.println("Please check it in the MySQL Table. Record is now deleted.......");
	    }
	}


