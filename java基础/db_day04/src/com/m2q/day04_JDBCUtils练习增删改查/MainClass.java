package com.m2q.day04_JDBCUtils练习增删改查;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select();
		//insert();
		//update();
		delete();
	}
	public static void insert(){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int rows = st.executeUpdate("insert into category (cname) values('冰箱'),('空调'),('吸尘器')");
			System.out.println("插入了"+rows+"行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
		
	}
	public static void delete(){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int rows = st.executeUpdate("delete from category where cname = '新冰箱'");
			System.out.println("删除了"+rows+ "行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}
	public static void update(){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int rows = st.executeUpdate("update category set cname = '新冰箱' where cname = '冰箱'");
			System.out.println("更新了"+ rows+"行");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}
	public static void select(){
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from category");
			while(rs.next()){
				Object cid = rs.getObject("cid");
				Object cname = rs.getObject("cname");
				System.out.println(cid +"," + cname);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}

}
