package com.m2q.day11_FileInputStream一次读取一个字节;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("1.txt");
		int b = 0;
		while((b=fis.read())!=-1){
			System.out.println((char)b);
		}
	}

}
