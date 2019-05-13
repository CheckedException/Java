package com.m2q.day13_多线程runnable实现;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println("线程任务中的"+i );
		}
	}

}
