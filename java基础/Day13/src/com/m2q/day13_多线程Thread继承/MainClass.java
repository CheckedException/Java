package com.m2q.day13_多线程Thread继承;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 120; i++) {
			System.out.println("main线程中"+i);
		}
	}

}
