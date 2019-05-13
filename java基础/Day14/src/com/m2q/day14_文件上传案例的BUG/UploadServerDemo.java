package com.m2q.day14_文件上传案例的BUG;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建server对象
		ServerSocket server = new ServerSocket(2555);
		System.out.println("等待客户端连接。。。");
			//传感客户端连接
			Socket client = server.accept();
			System.out.println("客户端连接诶成功");
			//创建文件输出流
			FileOutputStream fos = new FileOutputStream("D:\\Files\\Desktop\\Java\\file\\"+System.currentTimeMillis()+".jpg");
			//获取输入流
			InputStream in = client.getInputStream();
			//读取输入流
			byte[] bs = new byte[1024];
			int len =0;
			while((len =in.read(bs))!= -1){
				fos.write(bs,0,len);
			}
//			in.close();
//			fos.close();
//			client.close();
			//server.close();
			System.out.println("文件上传成功");
			OutputStream out = client.getOutputStream();
			out.write("文件上传成功,可以查看了".getBytes());
			out.close();
		
			
			in.close();
			fos.close();
			client.close();
			server.close();
	}


}
