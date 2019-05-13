package com.m2q.day04_JDBC�������ݿ�Ĳ���ʵ��;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//connDB2();
		connectDB2();
		
	}	
	public static void connectDB() throws Exception{
		//ע������
				com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				//�������
				String url = "jdbc:mysql://localhost:3306/day04";
				Connection conn =  DriverManager.getConnection(url,"root","123456789");
				//���ִ��sql���Ķ���
				Statement stmt =  conn.createStatement();
				//ִ��SQL���
				ResultSet rs = stmt.executeQuery("select * from category");
				//��������
				while(rs.next()){
					Object cid = rs.getInt("cid");
					Object cname = rs.getString("cname");
					System.out.println(cid + "," + cname);
				}
				//�ͷ���Դ
				rs.close();
				stmt.close();
				conn.close();
	}
	
	public static void conDB2() throws Exception{
		//ע������
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		//�������
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//������Ӷ���
		Statement stmt = conn.createStatement();
		//ִ��sql��䲢����ֵ
		ResultSet rs = stmt.executeQuery("select * FROM CATEGORY ");
		//������
		while(rs.next()){
			Integer cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			System.out.println(cid +","+ cname);
		}
		//�ͷ���Դ
		rs.close();
		stmt.close();
		conn.close();
		
	}
	public static void connDB2() throws Exception{
		//ע������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//��������
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//�������ӽ���
		Statement stmt = conn.createStatement();
		//ִ��sql���
		ResultSet rs = stmt.executeQuery("select * from category");
		//��������
		while(rs.next()){
			Object cid = rs.getObject("cid");
			Object cname = rs.getObject("cname");
			System.out.println(cid + "," + cname);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	
	public static void connectDB2() throws Exception{
		//1ע������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.��������
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//3������ѯ
		Statement stmt = conn.createStatement();
		//4.��ѯ
		ResultSet rs = stmt.executeQuery("select * from category");
		//5��������
		while(rs.next()){
			Object cid = rs.getObject("cid");
			Object cname = rs.getObject("cname");
			System.out.println(cid +","+cname);
		}
		//�ر���Դ
		rs.close();
		stmt.close();
		conn.close();
	}

}
