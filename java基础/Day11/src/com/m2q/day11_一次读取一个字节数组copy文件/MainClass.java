package com.m2q.day11_一次读取一个字节数组copy文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//设定输入流
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//设定输出流
		FileOutputStream fos = new FileOutputStream("copy2.jpg");
		int b = 0;
		//设定流存储字节数
		byte[] bt = new byte[4];
		//读取流
		while((b = fis.read(bt)) != -1){
			fos.write(bt, 0, b);;
		}
		fos.close();
		fis.close();
	}

}
