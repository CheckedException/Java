package com.m2q.day06_view;

import com.m2q.day06_service.AccountService;

public class AccountView {
	public static void main(String[] args) {
		String fromName = "jack";
		String toName = "tom";
		double money = 1000;
		AccountService service = new AccountService();
		service.transfer(fromName, toName, money);
	}
}
