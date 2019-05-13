package com.m2q.day06_utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	//获取连接
	public static Connection getConnection() throws Exception{
		Connection conn = tl.get();
		if (conn == null) {
			conn =C3P0Utils.getConnection() ;
			tl.set(conn);
		}
		return conn;
	}
	//开启事物
	public static void start() throws SQLException, Exception{
		ConnectionManager.getConnection().setAutoCommit(false);
	}
	//提交事务
	public static void commit() throws SQLException, Exception{
		ConnectionManager.getConnection().commit();
	}
	//回滚事务
	public static void rollback() throws  Exception{
		ConnectionManager.getConnection().rollback();
	}
	//关闭资源
	public static void close() throws SQLException, Exception{
		ConnectionManager.getConnection().close();
	}
}
