package com.m2q.day13_���߳�runnableʵ��;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����
		//MyThread mt = new MyThread();
		//����thread�߳�
		Thread th = new Thread(new MyThread());
		th.start();
		for (int i = 23; i <99; i++) {
			System.out.println("main�߳��е�"+i);
		}
	}

}
