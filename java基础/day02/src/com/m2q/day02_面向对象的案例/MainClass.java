package com.m2q.day02_面向对象的案例;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier sd = new Soldier();
		sd.name = "张三";
		Tank tk = new Tank();
		tk.type = "天启坦克";
		Plane p = new Plane();
		p.type = "歼-20战斗机";
		sd.DriveTanPlayPlane(tk, p);
		tk.playPlane(p);
		p.bom();
	}

}
