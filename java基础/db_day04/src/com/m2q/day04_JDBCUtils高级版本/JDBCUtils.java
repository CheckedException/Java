package com.m2q.day04_JDBCUtils�߼��汾;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;

	static {

		try {
			// ���������ļ�
			Properties ps = new Properties();
			ps.load(new FileInputStream("gjdbc_config.properties"));
			driver = ps.getProperty("driver");
			url = ps.getProperty("url");
			user = ps.getProperty("user");
			password = ps.getProperty("password");
			// ע������
			Class.forName(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("ע������ʧ�ܡ�");
		}
	}

	public static Connection getConnection() throws Exception {
		// ��������
		Connection conn = DriverManager.getConnection(url, user, password);
		// ��������
		Statement st = conn.createStatement();
		return conn;
	}

	public static void closeAll(Connection conn, Statement pst, ResultSet rs) {
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
