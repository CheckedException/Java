package com.m2q.day09_linkedhashmap����ɾ�Ĳ�;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m= new LinkedHashMap<String, String>();
		//put  ����
		m.put("a", "aa");
		m.put("b", "bb");
		m.put("c", "cc");
		m.put("d", "dd");
		m.put("e", "ee");
		m.put("f", "ff");
		//remove ɾ��
		System.out.println(m);
		m.remove("e");
		System.out.println(m);
		m.put("e", "ee");
		System.out.println(m);
		//put ����
		m.put("d", "DD");
		System.out.println(m);
		//get chaxun
		String d = m.get("d");
		System.out.println(d);
	}

}
