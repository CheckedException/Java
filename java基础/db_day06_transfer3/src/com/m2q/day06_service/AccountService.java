package com.m2q.day06_service;

import java.sql.Connection;
import java.sql.SQLException;

import com.m2q.day06_dao.AccountDao;
import com.m2q.day06_utils.C3P0Utils;
import com.m2q.day06_utils.ConnectionManager;

public class AccountService {
	public void transfer(String fromName,String toName,double money){
		AccountDao ad = new AccountDao();
//		Connection conn = null;
		try {
//			conn = C3P0Utils.getConnection();
//			conn = ConnectionManager.getConnection();
//			conn.setAutoCommit(false);
			ConnectionManager.start();
			ad.fromAccount(fromName, money);
			ad.toAccount(toName, money);
//			conn.commit();
			ConnectionManager.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ÓÐÒì³££¬×ªÕËÊ§°Ü");
			try {
//				conn.rollback();
				ConnectionManager.rollback();;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			try {
//				conn.close();
				ConnectionManager.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
