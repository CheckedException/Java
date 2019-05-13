package com.m2q.day05.C3P0连接池编写;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
//	static{
//		try {
//			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
//			ds.setJdbcUrl("jdbc:mysql://localhost:3306/day04?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false");
//			ds.setUser("root");
//			ds.setPassword("123456789");
//		} catch (PropertyVetoException e) {
//			// TODO Auto-generated catch block
//			System.out.println("有异常");;
//		}
//		
//	}
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
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
