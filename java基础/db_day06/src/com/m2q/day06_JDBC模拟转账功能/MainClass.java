package com.m2q.day06_JDBCģ��ת�˹���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.ע������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.��ȡ���ݿ�����
		String url = "jdbc:mysql://localhost:3306/day06?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//3.������������
		Statement st = conn.createStatement();
		//4.ִ��SQL���
		String sqlForJack = "Update account set money = money-1000 where name = 'jack'";
		int rowsForJack = st.executeUpdate(sqlForJack);
		String sqlForRose = "Update account set money = money+1000 where name = 'rose'";
		int rowsForRose = st.executeUpdate(sqlForRose);
		//5.����SQL���
		if (rowsForJack >0 && rowsForRose >0) {
			System.out.println("ת�˳ɹ�");
		}else{
			System.out.println("ת��ʧ��");
		}
		//6.�ر���Դ
		st.close();
		conn.close();
	}

}
