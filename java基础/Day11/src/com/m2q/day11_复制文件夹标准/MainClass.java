package com.m2q.day11_复制文件夹标准;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileSrc = new File("D:\\Files\\Desktop\\Java");
		File fileObj = new File("D:\\copy");
		if (!fileObj.exists()) {
			fileObj.mkdir();
			System.out.println("目标文件夹不存在，成功创建文件夹" +fileObj.toString());
		}else{
			System.out.println("文件夹已经存在，不需要创建");
		}
		//列出文件夹下面的所有文件
		File[] files = fileSrc.listFiles();
		//循环文件夹里面的所有文件
		for (File file : files) {
			File FileTo = new File(fileObj, file.getName());
			copy(file,FileTo);
			System.out.println("复制文件夹"+ file.getName() +"成功");
		}
		System.out.println("复制所有文件成功");
	}

	private static void copy(File file, File fileTo) throws IOException {
		// TODO Auto-generated method stub
		//读取文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		//写入文件缓冲流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileTo));
		//读取文件
		byte[] bs = new byte[1000];
		int len = 0;
		while((len = bis.read(bs))!= -1){
			bos.write(bs, 0, len);
		}
		bos.close();
		bis.close();
		System.out.println("复制文件" + file.getName() + "成功");
	}

}
