package com.m2q.day05_异常产生的过程;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2,3,6,5,4};
		int s = getNum(a);
		System.out.println(s);

	}
	public static int getNum(int [] num){
		int a = num[8];
		return a;
	}

}
