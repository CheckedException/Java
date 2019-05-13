package com.m2q.day09_Map存储自定义类型;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> s =new  HashMap<String, Student>();
		s.put("a",new Student("张三", 18));
		s.put("b",new Student("李四", 20));
		s.put("c",new Student("王五", 2));
		Set<Map.Entry<String, Student>> entrys = s.entrySet();
		Iterator<Entry<String, Student>> it = entrys.iterator();
		while(it.hasNext()){
			Entry<String, Student> entry = it.next();
			Student value = entry.getValue();
			String key = entry.getKey();
			System.out.println(value);
			String name = value.name;
			int age = value.age;
			System.out.println(name + "is" + age + "years old");
		}
	}



}
