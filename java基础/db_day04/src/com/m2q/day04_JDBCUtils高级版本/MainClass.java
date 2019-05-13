package com.m2q.day04_JDBCUtils高级版本;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();
	}

	private static void insert() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst= null;
		try {
			System.out.println("请输入用户名");
			Scanner in = new Scanner(System.in);
			String username = in.nextLine();
			System.out.println("请输入密码");
			String password = in.nextLine();
			conn = JDBCUtils.getConnection();
			String sql = "insert into users(username,password)values(?,?)";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, password);
			int rows = pst.executeUpdate();
			System.out.println("插入了"+rows+"行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, pst, null);
		}
	}

}
