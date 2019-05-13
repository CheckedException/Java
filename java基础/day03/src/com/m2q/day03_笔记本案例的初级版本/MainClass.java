package com.m2q.day03_笔记本案例的初级版本;

public class MainClass {

	/*
	 * 
	 * 模拟笔记本电脑使用鼠标
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer();
		cp.start();
		Mouse ms = new Mouse();
		cp.userMouse(ms);
		cp.end();
	}

}
