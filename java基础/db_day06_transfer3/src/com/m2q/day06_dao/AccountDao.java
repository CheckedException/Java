package com.m2q.day06_dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.m2q.day06_utils.C3P0Utils;
import com.m2q.day06_utils.ConnectionManager;

public class AccountDao {
	public void fromAccount(String fromName,double money) throws Exception{
		//Ë­×ªÕË
		Connection conn = ConnectionManager.getConnection();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"Update account set money = money-? where name = ?",money,fromName);
//		System.out.println(1/0);
	}
	//¸øË­×ªÕË
	public void toAccount(String toName,double money) throws Exception{
		Connection conn = ConnectionManager.getConnection();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"Update account set money = money+? where name = ?",money,toName);
	}
}
