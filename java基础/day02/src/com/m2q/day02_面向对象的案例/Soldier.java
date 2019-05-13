package com.m2q.day02_面向对象的案例;

public class Soldier {
	String name ;
	String level;
	
	public void DriveTanPlayPlane(Tank tk,Plane pl){
		System.out.println(name + "开着"+ tk.type + "，准备去打飞机。。。");
	}
}
