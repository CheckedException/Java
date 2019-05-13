package com.m2q.day06_DBUtils模拟转账案例;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Connection conn = null;
		try {
			conn= C3P0Utils.getConnection();
			conn.setAutoCommit(false);
			int rows1 = qr.update(conn,"Update account set money = money-? where name = ?", 1000,"jack");
			//System.out.println(1/0);
			int rows2 = qr.update(conn,"Update account set money = money+? where name = ?", 1000,"rose");
			if (rows1 >0&& rows2 >0) {
				System.out.println("转账成功");
			}
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
