package com.m2q.day11_FileInputStream一次读取一个数组;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//建立文件输入流
//		FileInputStream fis = new FileInputStream("1.txt");
//		byte[] bt = new byte[4];
//		int b = 0;
//		while((b=fis.read(bt))!=-1){
//			String re = new String(bt,0,b);
//			System.out.print(re);
//		}
//		fis.close();
		
		FileInputStream fis = new FileInputStream("1.txt");
		byte[] b = new byte[20];
		int s = 0;
		while((s = fis.read(b))!=-1){
			String re = new String(b, 0, s);
			System.out.println(re);
		}
	}

}
