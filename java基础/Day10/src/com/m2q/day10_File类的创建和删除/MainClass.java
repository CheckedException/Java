package com.m2q.day10_File类的创建和删除;

import java.io.File;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Files\\Desktop\\Java\\a");
//		System.out.println(file);
//		//创建文件
//		boolean b = file.createNewFile();
//		if (b) {
//			System.out.println("创建文件成功~");
//		}else{
//			System.out.println("创建文件失败~");
//		}
		boolean b = file.mkdir();
		if (b) {
			System.out.println("创建文件夹成功~");
		}else{
			System.out.println("创建文件夹失败~");
		}
	}

}
