package com.m2q.day14_文件上传案例的BUG;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建Client对象
		Socket client = new Socket("127.0.0.1", 2555);
		//创建上传数据对象
		OutputStream out = client.getOutputStream();
		//创建流
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//上传文件
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs))!=-1){
			out.write(bs,0,len);
		}
		client.shutdownOutput();
		//
		System.out.println("关闭流完成");
		InputStream in = client.getInputStream();
		byte[] bs1 = new byte[1024];
		int len1 = in.read(bs1);
		System.out.println(new String(bs1, 0, len1));
		in.close();
		fis.close();
		out.close();
		client.close();
	}

}
