package com.m2q.day06_utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	//��ȡ����
	public static Connection getConnection() throws Exception{
		Connection conn = tl.get();
		if (conn == null) {
			conn =C3P0Utils.getConnection() ;
			tl.set(conn);
		}
		return conn;
	}
	//��������
	public static void start() throws SQLException, Exception{
		ConnectionManager.getConnection().setAutoCommit(false);
	}
	//�ύ����
	public static void commit() throws SQLException, Exception{
		ConnectionManager.getConnection().commit();
	}
	//�ع�����
	public static void rollback() throws  Exception{
		ConnectionManager.getConnection().rollback();
	}
	//�ر���Դ
	public static void close() throws SQLException, Exception{
		ConnectionManager.getConnection().close();
	}
}
