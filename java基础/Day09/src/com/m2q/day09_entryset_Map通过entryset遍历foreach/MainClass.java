package com.m2q.day09_entryset_Map通过entryset遍历foreach;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m= new LinkedHashMap<String, String>();
		//put  新增
		m.put("a", "aa");
		m.put("b", "bb");
		m.put("c", "cc");
		m.put("d", "dd");
		m.put("e", "ee");
		m.put("f", "ff");
		Set<Map.Entry<String, String>> entrys = m.entrySet();
		for (Entry<String, String> entry : entrys) {
			String value = entry.getValue();
			String key = entry.getKey();
			System.out.println(value +key);
		}
	}

}
