package com.m2q.day07_增强for循环;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,2,3,4,5,6,7,8,9};
//		for(int s : a){
//			System.out.println(s);
//		}
		Collection<String> coll =new ArrayList<String>();
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		System.out.println(coll);
		Object[] o = coll.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		for(String s : coll){
			System.out.println(s);
		}
	}

}
