package com.m2q.day06_dataʹ��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʽ��ʱ���ʽ��ʹ��formate���췽��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//��ʾ��ǰ�������е�ʱ��
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
