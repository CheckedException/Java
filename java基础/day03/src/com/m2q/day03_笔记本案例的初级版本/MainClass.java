package com.m2q.day03_�ʼǱ������ĳ����汾;

public class MainClass {

	/*
	 * 
	 * ģ��ʼǱ�����ʹ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer();
		cp.start();
		Mouse ms = new Mouse();
		cp.userMouse(ms);
		cp.end();
	}

}
