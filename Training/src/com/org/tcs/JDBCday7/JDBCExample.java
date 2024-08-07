package com.org.tcs.JDBCday7;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
	private static final String URL="jdbc:mysql://localhost:3306/tcsDB";
	private static final String USER="root";
	private static final String PASSWORD="Root123$";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	public static void main(String[] args) {
		try(Connection connection=getConnection()) {
			if(connection!=null) {
				System.out.println("connected to dataBase!");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
