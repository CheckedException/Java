package com.m2q.day03_�ʼǱ������ĸ߼��汾;

public class Computer {
	String name;
	double price;
	public void start(){
		System.out.println("���Կ����ˡ���");
	}
	public void useUSB(usbInterface usb){
		usb.open();
		usb.use();
		usb.close();
	}
	public void end(){
		System.out.println("���Թػ���");
	}
}
