package com.m2q.day04_PreparedStatement练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/day04";
	private static String user = "root";
	private static String password = "123456789"; 

	static {
		// 注册驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("注册驱动失败。");
		}
	}
	public static Connection getConnection() throws Exception{
		// 建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 创建连接
		Statement st = conn.createStatement();
		return conn;
	}
	public static void closeAll(Connection conn,Statement st,ResultSet rs){
		try {
			if (conn != null) {
				conn.close();
			}
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
