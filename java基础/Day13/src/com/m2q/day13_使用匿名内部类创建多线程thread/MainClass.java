package com.m2q.day13_ʹ�������ڲ��ഴ�����߳�thread;

public class MainClass {
	public static void main(String[] args){
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("thread��ĵ�"+i +"���߳�");
				}
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 100; i < 200; i++) {
					System.out.println("runnableʵ�ֽӿڵĵ�"+i + "���߳�");
				}
			}
		}).start();
	}
}
