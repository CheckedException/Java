package com.m2q.day06_JDBC模拟转账功能;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.注册驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.获取数据库连接
		String url = "jdbc:mysql://localhost:3306/day06?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
		//3.建立数据事物
		Statement st = conn.createStatement();
		//4.执行SQL语句
		String sqlForJack = "Update account set money = money-1000 where name = 'jack'";
		int rowsForJack = st.executeUpdate(sqlForJack);
		String sqlForRose = "Update account set money = money+1000 where name = 'rose'";
		int rowsForRose = st.executeUpdate(sqlForRose);
		//5.处理SQL结果
		if (rowsForJack >0 && rowsForRose >0) {
			System.out.println("转账成功");
		}else{
			System.out.println("转账失败");
		}
		//6.关闭资源
		st.close();
		conn.close();
	}

}
