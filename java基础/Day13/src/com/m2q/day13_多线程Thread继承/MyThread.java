package com.m2q.day13_���߳�Thread�̳�;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 120; i++) {
			System.out.println("�߳������е�"+ i);
		}
	}
}
