package com.m2q.day06_utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.activation.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class C3P0Utils {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	public static ComboPooledDataSource getDataSource(){
		return ds;
	}
	//获取连接池
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
	}
	//关闭资源
	public static void closeAll(Connection conn ,Statement st,ResultSet rs){
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
