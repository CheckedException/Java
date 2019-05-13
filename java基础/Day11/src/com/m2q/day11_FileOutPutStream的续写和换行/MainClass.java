package com.m2q.day11_FileOutPutStream的续写和换行;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("1.txt",true);
		fos.write("\r\nhellowrold".getBytes());
		fos.close();
	}

}
