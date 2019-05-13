package com.m2q.day05_DBCP使用配置文件编写;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPUtils2 {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/day04";
	private static String username = "root";
	private static String password = "132456789";
	private static BasicDataSource ds = new BasicDataSource();

	static {
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
	}

	public static Connection getConnection() throws Exception {
		return ds.getConnection();
	}

	public static void closeAll(Connection conn, PreparedStatement pst, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (pst != null) {
				pst.close();
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
