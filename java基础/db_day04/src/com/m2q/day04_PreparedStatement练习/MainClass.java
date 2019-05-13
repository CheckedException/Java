package com.m2q.day04_PreparedStatement��ϰ;

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
		System.out.println("�������û���");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		System.out.println("����������");
		String password = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into users (username,password)values(?,?)";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, password);
			int rows = pst.executeUpdate();
			System.out.println("������"+rows +"��");
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
		System.out.println("������Ҫɾ��������");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from users where username = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			int rows = pst.executeUpdate();
			if (rows>0) {
				System.out.println("ɾ����"+rows+"��");
			}else{
				System.out.println("ɾ��ʧ��");
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
		System.out.println("��Ҫ���û�������Ϊ��");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		System.out.println("uid�ǣ�");
		String uid = in.nextLine();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update users set username = ? where uid = ?";
			pst = conn.prepareStatement(sql);
			pst.setObject(1, username);
			pst.setObject(2, uid);
			int rows = pst.executeUpdate();
			System.out.println("������"+ rows + "��");
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
