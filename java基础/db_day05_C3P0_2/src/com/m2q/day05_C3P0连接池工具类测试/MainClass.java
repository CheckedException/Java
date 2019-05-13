package com.m2q.day05_C3P0连接池工具类测试;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private static int rows;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		insert();
//		delete();
		//delete
//		update();
		select();
		Connection conn = C3P0Utils.getConnection();
		System.out.println(conn);
	}

	private static void select() {
		// TODO Auto-generated method stub
		try {
			conn = C3P0Utils.getConnection();
			String sql = "select * from users where username = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, "三");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Object username = rs.getObject("username");
				Object password = rs.getObject("password");
				System.out.println("username is "+username + " and password is " + password);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("有异常");
		}finally {
			C3P0Utils.closeAll(conn, pst, rs);
		}
	}

	private static void update() {
		// TODO Auto-generated method stub
		try {
			conn = C3P0Utils.getConnection();
			String sql = "update users set password = ? where username = '张三'";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, "asdf");
			rows = pst.executeUpdate();
			if (rows>0) {
				System.out.println("更新数据成功");
			}else {
				System.out.println("failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("有异常");
		}finally {
			C3P0Utils.closeAll(conn, pst, rs);
		}
	}

	private static void delete() {
		// TODO Auto-generated method stub
		int rows = 0;
		Connection conn = null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		try {
			conn = C3P0Utils.getConnection();
			String sql = "delete from users where username = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1,"张三");
			rows = pst.executeUpdate();
			if (rows>0) {
				System.out.println("删除数据成功");
			}else {
				System.out.println("failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("有异常");
		}finally {
			C3P0Utils.closeAll(conn, pst, rs);
		}
	}

	private static void insert() {
		// TODO Auto-generated method stub
		int rows = 0;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = C3P0Utils.getConnection();
			String sql = "INSERT INTO users ( username, password) VALUES(?, ?) ";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, "张三");
			pst.setObject(2, "asdfgggh");
			rows = pst.executeUpdate();
			if (rows >0) {
				System.out.println("插入数据成功");
			}else {
				System.out.println("failed");
			}
		} catch  (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			C3P0Utils.closeAll(conn, pst, rs);
		}
		
	}

}
