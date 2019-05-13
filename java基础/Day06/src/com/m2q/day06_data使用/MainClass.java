package com.m2q.day06_data使用;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//格式化时间格式，使用formate构造方法
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//显示当前代码运行的时间
		Date d = new Date();
		String date = sdf.format(d);
		System.out.println(date);
		try {
			Date ds = sdf.parse(date);
			System.out.println(ds);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
