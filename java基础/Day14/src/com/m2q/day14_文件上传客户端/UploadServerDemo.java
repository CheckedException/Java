package com.m2q.day14_文件上传客户端;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建Server对象
		ServerSocket server = new ServerSocket(2555);
		//连接客户端
		System.out.println("等待客户端连接");
		Socket client = server.accept();
		System.out.println("客户端连接成功");
		//创建文件输入流
		InputStream in = client.getInputStream();
		//创建文件输出流
		FileOutputStream fos = new FileOutputStream("D:\\Files\\Desktop\\Java\\file\\"+System.currentTimeMillis()+".jpg");
		byte[] bs = new byte[1024];
		int len = 0;
		while((len= in.read(bs))!= -1){
			System.out.println("正在写入数据" + len);
			fos.write(bs,0,len);
		}
		System.out.println("上传文件成功");
		fos.close();
		in.close();
		client.close();
		server.close();
	}

}
