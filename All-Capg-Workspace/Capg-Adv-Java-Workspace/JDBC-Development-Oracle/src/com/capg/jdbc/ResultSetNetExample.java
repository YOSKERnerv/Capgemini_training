package com.capg.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetNetExample {
	public static void main(String args[]) {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "YOSKER";
		String password = "yosker";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,password);
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from Employeeinfo1");
				while(rs.next()) {
					System.out.println("Employee No: "+rs.getInt(1));
					System.out.println("Employee Name: "+rs.getString("ename"));
					System.out.println("Employee sal: "+rs.getInt(3));
				}
			}
			catch(SQLException e) {
				System.out.println(e);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
