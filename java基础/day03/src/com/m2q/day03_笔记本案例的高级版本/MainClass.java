package com.m2q.day03_�ʼǱ������ĸ߼��汾;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer();
		Mouse mm = new Mouse();
		KeyBoard kb = new KeyBoard();
		cp.start();
		cp.useUSB(mm);
		cp.useUSB(kb);
		cp.end();
		
		
	}

}
