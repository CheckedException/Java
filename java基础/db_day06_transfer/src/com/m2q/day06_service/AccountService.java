package com.m2q.day06_service;

import java.sql.SQLException;

import com.m2q.day06_dao.AccountDao;

public class AccountService {
	public void transfer(String fromName,String toName,double money){
		AccountDao ad = new AccountDao();
		try {
			ad.fromAccount(fromName, money);
			ad.toAccount(toName, money);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
