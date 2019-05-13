package com.m2q.day14_文件上传客户端;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建Socket对象
		Socket client = new Socket("127.0.0.1", 2555);
		//创建文件上传流
		OutputStream out = client.getOutputStream();
		//创建文件流
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//读取文件
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs))!= -1){
			out.write(bs,0,len);
		}
		System.out.println("上传完成");
		fis.close();
		out.close();
		client.close();
	}

}
