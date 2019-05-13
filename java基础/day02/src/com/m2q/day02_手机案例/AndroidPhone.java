package com.m2q.day02_手机案例;

public class AndroidPhone extends Phone {
	public void call(){
		super.call();
		System.out.println("正在开视频");
	}
	public void sendMsg(){
//		System.out.println("正在发短信");
		super.sendMsg();
		System.out.println("正在发文件");
	}
}
