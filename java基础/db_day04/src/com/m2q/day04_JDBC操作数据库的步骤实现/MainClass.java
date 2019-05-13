package com.m2q.day04_JDBC操作数据库的步骤实现;

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
		//注册驱动
				com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				//获得连接
				String url = "jdbc:mysql://localhost:3306/day04";
				Connection conn =  DriverManager.getConnection(url,"root","123456789");
				//获得执行sql语句的对象
				Statement stmt =  conn.createStatement();
				//执行SQL语句
				ResultSet rs = stmt.executeQuery("select * from category");
				//处理结果街
				while(rs.next()){
					Object cid = rs.getInt("cid");
					Object cname = rs.getString("cname");
					System.out.println(cid + "," + cname);
				}
				//释放资源
				rs.close();
				stmt.close();
				conn.close();
	}
	
	public static void conDB2() throws Exception{
		//注册驱动
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		//获得连接
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//获得连接对象
		Statement stmt = conn.createStatement();
		//执行sql语句并返回值
		ResultSet rs = stmt.executeQuery("select * FROM CATEGORY ");
		//处理结果
		while(rs.next()){
			Integer cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			System.out.println(cid +","+ cname);
		}
		//释放资源
		rs.close();
		stmt.close();
		conn.close();
		
	}
	public static void connDB2() throws Exception{
		//注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//创建连接
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//建立连接进程
		Statement stmt = conn.createStatement();
		//执行sql语句
		ResultSet rs = stmt.executeQuery("select * from category");
		//处理结果集
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
		//1注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.建立连接
		String url = "jdbc:mysql://localhost:3306/day04";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//3建立查询
		Statement stmt = conn.createStatement();
		//4.查询
		ResultSet rs = stmt.executeQuery("select * from category");
		//5处理结果集
		while(rs.next()){
			Object cid = rs.getObject("cid");
			Object cname = rs.getObject("cname");
			System.out.println(cid +","+cname);
		}
		//关闭资源
		rs.close();
		stmt.close();
		conn.close();
	}

}
