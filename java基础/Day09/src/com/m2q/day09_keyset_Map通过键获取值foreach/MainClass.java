package com.m2q.day09_keyset_Mapͨ������ȡֵforeach;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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
		Set<String> s = m.keySet();
		//������
		//Iterator<String> i = s.iterator();
		Object[] o = s.toArray();
		for (Object object : o) {
			String value = m.get(object);
			System.out.println(value);
		}
	}

}
