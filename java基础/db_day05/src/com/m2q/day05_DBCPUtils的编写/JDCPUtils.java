package com.m2q.day05_DBCPUtilsµÄ±àÐ´;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class JDCPUtils {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/day04";
	private static String username = "root";
	private static String password = "123456789";
	private static BasicDataSource ds = new BasicDataSource();
	static {
			ds.setDriverClassName(url);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);

	}
	public static Connection getConnection() throws SQLException{
		Connection conn = ds.getConnection();
		return conn;
	}

	public static void closeAll(Connection conn, Statement st, ResultSet rs) {
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
