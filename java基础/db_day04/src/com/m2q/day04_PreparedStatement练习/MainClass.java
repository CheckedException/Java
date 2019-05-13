package com.m2q.day04_PreparedStatement练习;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //insert();
		//delete();
		update();
	}

	public static void insert() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		System.out.println("请输入用户名");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		System.out.println("请输入密码");
		String password = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into users (username,password)values(?,?)";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, password);
			int rows = pst.executeUpdate();
			System.out.println("插入了"+rows +"行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			JDBCUtils.closeAll(conn, pst, rs);
		}
	}

	public static void delete() {
		Connection conn = null;
		PreparedStatement pst = null;
		System.out.println("请输入要删除的内容");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from users where username = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			int rows = pst.executeUpdate();
			if (rows>0) {
				System.out.println("删除了"+rows+"行");
			}else{
				System.out.println("删除失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, pst, null);
		}
	}

	public static void update() {
		Connection conn = null;
		PreparedStatement pst = null;
		System.out.println("需要将用户名更新为：");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		System.out.println("uid是：");
		String uid = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update users set username = ? where uid = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, uid);
			int rows = pst.executeUpdate();
			System.out.println("更新了"+ rows + "行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, pst, null);
		}
	}

	public static void select() {

	}

}
