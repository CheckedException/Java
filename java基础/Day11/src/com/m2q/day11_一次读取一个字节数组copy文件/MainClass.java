package com.m2q.day11_һ�ζ�ȡһ���ֽ�����copy�ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�趨������
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//�趨�����
		FileOutputStream fos = new FileOutputStream("copy2.jpg");
		int b = 0;
		//�趨���洢�ֽ���
		byte[] bt = new byte[4];
		//��ȡ��
		while((b = fis.read(bt)) != -1){
			fos.write(bt, 0, b);;
		}
		fos.close();
		fis.close();
	}

}
