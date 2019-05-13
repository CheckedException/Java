package com.m2q.day03_代理设计模式完善;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy xp = new Boy();
		xp.name = "xiaopeng";
		girl xx = new girl();
		Man xm = new Man();
		xp.nvyou = xm;
		xp.hungery();
		xp.thirsty();
		xp.tired();
	}

}
