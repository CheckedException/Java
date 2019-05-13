package com.m2q.day03_笔记本案例的高级版本;

public class Computer {
	String name;
	double price;
	public void start(){
		System.out.println("电脑开机了。。");
	}
	public void useUSB(usbInterface usb){
		usb.open();
		usb.use();
		usb.close();
	}
	public void end(){
		System.out.println("电脑关机了");
	}
}
