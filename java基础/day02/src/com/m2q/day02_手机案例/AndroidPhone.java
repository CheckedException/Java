package com.m2q.day02_�ֻ�����;

public class AndroidPhone extends Phone {
	public void call(){
		super.call();
		System.out.println("���ڿ���Ƶ");
	}
	public void sendMsg(){
//		System.out.println("���ڷ�����");
		super.sendMsg();
		System.out.println("���ڷ��ļ�");
	}
}
