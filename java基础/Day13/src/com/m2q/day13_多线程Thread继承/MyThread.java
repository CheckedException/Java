package com.m2q.day13_多线程Thread继承;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 120; i++) {
			System.out.println("线程任务中的"+ i);
		}
	}
}
