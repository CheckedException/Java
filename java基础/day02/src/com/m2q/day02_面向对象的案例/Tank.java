package com.m2q.day02_面向对象的案例;

public class Tank {
	String type ;
	
	public void playPlane(Plane p){
		System.out.println(type + ",发出一个个炮弹，射向远方的" + p.type + ".....");
	}
}
