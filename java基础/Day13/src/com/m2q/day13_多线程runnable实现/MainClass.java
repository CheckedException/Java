package com.m2q.day13_多线程runnable实现;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现类
		//MyThread mt = new MyThread();
		//穿件thread线程
		Thread th = new Thread(new MyThread());
		th.start();
		for (int i = 23; i <99; i++) {
			System.out.println("main线程中的"+i);
		}
	}

}
