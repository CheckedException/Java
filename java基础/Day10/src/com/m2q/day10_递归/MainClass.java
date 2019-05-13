package com.m2q.day10_µÝ¹é;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¼ÆËã1-100µÄºÍ
		int a = putong(10);
		System.out.println( a);
		int b = digui(10);
		System.out.println(b);
	}

	private static int digui(int i) {
		// TODO Auto-generated method stub
		//(1+2+3+4...n-1)+n+1
		if (i==1) {
			return 1;
		}
		return digui(i-1) +i;
	}

	private static int putong(int i) {
		// TODO Auto-generated method stub10
		int num = 0;
		for (int j = 1; j <=i; j++) {
			num +=j;
		}
		return num;
	}
	

}
