package com.m2q.day07_���Ͽ��;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> arr = new ArrayList<>();
		arr.add("����");
		arr.add("����");
		arr.add("����");
		arr.add("����");
		System.out.println(arr);
		boolean b= arr.remove("����");
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
