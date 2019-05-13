package com.m2q.day02_案例实现;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE java = new JavaEE();
		System.out.print("JavaEE的工作是:"); java.work();
		Android an = new Android();
		System.out.print("Android的工作是:"); an.work();
		NetRepair nr = new NetRepair();
		System.out.print("NetRepair的工作是:"); nr.work();
		HardRepair hr = new HardRepair();
		System.out.print("HardRepair的工作是:"); hr.work();
	}

}
