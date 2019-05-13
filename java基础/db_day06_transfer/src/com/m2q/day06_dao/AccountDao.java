package com.m2q.day06_dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.m2q.day06_utils.C3P0Utils;

public class AccountDao {
	public void fromAccount(String fromName,double money) throws Exception{
		//Ë­×ªÕË
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		qr.update("Update account set money = money-? where name = ?",money,fromName);
	}
	//¸øË­×ªÕË
	public void toAccount(String toName,double money) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		qr.update("Update account set money = money+? where name = ?",money,toName);
	}
}
