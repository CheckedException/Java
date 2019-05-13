package com.m2q.day10_文件过滤器的使用;

import java.io.File;
import java.io.FileFilter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Files\\Desktop\\Java");
		MyFileFilter ff = new MyFileFilter();
		File[] files = f.listFiles(ff);
		for (File file : files) {
			System.out.println(file);
		}
	}

}
