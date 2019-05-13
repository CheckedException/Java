package com.m2q.day06_service;

import java.sql.Connection;
import java.sql.SQLException;

import com.m2q.day06_dao.AccountDao;
import com.m2q.day06_utils.C3P0Utils;

public class AccountService {
	public void transfer(String fromName,String toName,double money){
		AccountDao ad = new AccountDao();
		Connection conn = null;
		try {
			conn = C3P0Utils.getConnection();
			conn.setAutoCommit(false);
			ad.fromAccount(conn,fromName, money);
			ad.toAccount(conn,toName, money);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ÓÐÒì³££¬×ªÕËÊ§°Ü");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
