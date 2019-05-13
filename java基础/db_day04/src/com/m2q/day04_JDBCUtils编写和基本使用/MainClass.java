package com.m2q.day04_JDBCUtils编写和基本使用;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from category");
			while (rs.next()) {
				Object cid = rs.getObject("cid");
				Object cname = rs.getString("cname");
				System.out.println(cid + "," + cname);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}

	}

}
