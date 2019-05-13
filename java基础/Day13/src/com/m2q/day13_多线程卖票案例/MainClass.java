package com.m2q.day13_多线程卖票案例;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicketsDemo st = new SaleTicketsDemo();
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");
		t1.start();
		t2.start();
		t3.start();
	}

}
