package com.m2q.day04_JDBCUtils�߼��汾;

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
			System.out.println("�������û���");
			Scanner in = new Scanner(System.in);
			String username = in.nextLine();
			System.out.println("����������");
			String password = in.nextLine();
			conn = JDBCUtils.getConnection();
			String sql = "insert into users(username,password)values(?,?)";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, password);
			int rows = pst.executeUpdate();
			System.out.println("������"+rows+"��");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, pst, null);
		}
	}

}
