package com.tmf.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	 public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/hire_driver_db",
	                    "root",
	                    "password");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }


}
