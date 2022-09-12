package com.sonata.productDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
		Connection connection;
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product-details","root","root@123");
				
			}catch(ClassNotFoundException e){System.out.println(e);}
			catch(SQLException e1) {e1.printStackTrace();}
			return connection;
			
		}
	public void closeconnection() {
		try {
			if(connection!= null)
				connection.close();
			
		}catch(SQLException e) {e.printStackTrace();}
	}
	}


