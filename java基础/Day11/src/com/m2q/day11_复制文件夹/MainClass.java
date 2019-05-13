package com.m2q.day11_¸´ÖÆÎÄ¼þ¼Ð;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Files\\Desktop\\Java");
		File[] files = f.listFiles();
		for (File file : files) {
			String fileName = file.getName();
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("D:\\Files\\Desktop\\Java\\copy\\" + "copy-"+fileName);
			int i = 0;
			byte[] b = new byte[20];
			while((i = fis.read(b))!=-1){
				fos.write(b);
			}
			fos.close();
			fis.close();
			
		}
	}

}
