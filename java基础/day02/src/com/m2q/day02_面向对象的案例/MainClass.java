package com.m2q.day02_�������İ���;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier sd = new Soldier();
		sd.name = "����";
		Tank tk = new Tank();
		tk.type = "����̹��";
		Plane p = new Plane();
		p.type = "��-20ս����";
		sd.DriveTanPlayPlane(tk, p);
		tk.playPlane(p);
		p.bom();
	}

}
