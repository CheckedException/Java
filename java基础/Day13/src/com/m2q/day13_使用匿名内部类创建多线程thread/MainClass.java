package com.m2q.day13_使用匿名内部类创建多线程thread;

public class MainClass {
	public static void main(String[] args){
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("thread类的第"+i +"个线程");
				}
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 100; i < 200; i++) {
					System.out.println("runnable实现接口的第"+i + "个线程");
				}
			}
		}).start();
	}
}
