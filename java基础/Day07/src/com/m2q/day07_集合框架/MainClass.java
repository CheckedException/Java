package com.m2q.day07_集合框架;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> arr = new ArrayList<>();
		arr.add("张三");
		arr.add("李四");
		arr.add("王五");
		arr.add("赵柳");
		System.out.println(arr);
		boolean b= arr.remove("张三");
		System.out.println(b);
		System.out.println(arr);
		int len = arr.size();
		System.out.println(len);
		//arr.clear();
		System.out.println(arr);
		Object[] a =  arr.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
