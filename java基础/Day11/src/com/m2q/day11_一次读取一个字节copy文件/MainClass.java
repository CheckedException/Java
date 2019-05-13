package com.m2q.day11_一次读取一个字节copy文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		//System.out.println((char)a);
		int b = 0;
		while((b = fis.read()) != -1){
			fos.write(b);
		}
		fos.close();
		fis.close();
	}

}
