package com.m2q.day11_�����ļ��б�׼;

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
			System.out.println("Ŀ���ļ��в����ڣ��ɹ������ļ���" +fileObj.toString());
		}else{
			System.out.println("�ļ����Ѿ����ڣ�����Ҫ����");
		}
		//�г��ļ�������������ļ�
		File[] files = fileSrc.listFiles();
		//ѭ���ļ�������������ļ�
		for (File file : files) {
			File FileTo = new File(fileObj, file.getName());
			copy(file,FileTo);
			System.out.println("�����ļ���"+ file.getName() +"�ɹ�");
		}
		System.out.println("���������ļ��ɹ�");
	}

	private static void copy(File file, File fileTo) throws IOException {
		// TODO Auto-generated method stub
		//��ȡ�ļ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		//д���ļ�������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileTo));
		//��ȡ�ļ�
		byte[] bs = new byte[1000];
		int len = 0;
		while((len = bis.read(bs))!= -1){
			bos.write(bs, 0, len);
		}
		bos.close();
		bis.close();
		System.out.println("�����ļ�" + file.getName() + "�ɹ�");
	}

}
