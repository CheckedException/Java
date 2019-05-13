package com.m2q.day06_正则表达式案例;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone();
		qq();
		split();
		number();
	}

	private static void number() {
		// TODO Auto-generated method stub
		String number = "123-456-999";
		String[] s = number.split("-");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static void split() {
		// TODO Auto-generated method stub
		String ip = "192.168.1.1";
		String[] s = ip.split("\\.");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static void phone() {
		// TODO Auto-generated method stub
		String phone = "13456489411";
		boolean b = phone.matches("1[345789][0-9]{9}");
		System.out.println(b);
	}
	public static void qq(){
		String qq = "1234561111112";
		boolean s = qq.matches("[1-9][0-9]{4,11}");
		System.out.println(s);
	}

}
