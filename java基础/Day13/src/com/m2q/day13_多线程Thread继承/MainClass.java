package com.m2q.day13_���߳�Thread�̳�;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 120; i++) {
			System.out.println("main�߳���"+i);
		}
	}

}
