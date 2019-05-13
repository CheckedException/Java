package com.m2q.day03_笔记本案例的高级版本;

public class Mouse implements usbInterface{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("鼠标打开了");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("鼠标移动使用中");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("鼠标关闭了");
	}

}
