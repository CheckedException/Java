package com.m2q.day02_����ʵ��;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE java = new JavaEE();
		System.out.print("JavaEE�Ĺ�����:"); java.work();
		Android an = new Android();
		System.out.print("Android�Ĺ�����:"); an.work();
		NetRepair nr = new NetRepair();
		System.out.print("NetRepair�Ĺ�����:"); nr.work();
		HardRepair hr = new HardRepair();
		System.out.print("HardRepair�Ĺ�����:"); hr.work();
	}

}
