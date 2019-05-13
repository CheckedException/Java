package com.m2q.day03_代理设计模式引入;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy xp = new Boy();
		xp.name = "张三";
		Girl xx = new Girl();
		xx.name = "小霞";
		xp.nvyou = xx;
		xp.hungry();
		xp.thirsty();
		xp.tired();
	}

}
