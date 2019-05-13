package com.m2q.day14_TCP服务器和发信测试_复习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SererDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建server对象
		ServerSocket server = new ServerSocket(2555);
		//获取Client连接
		System.out.println("正在等待客户端连接");
		Socket client = server.accept();
		System.out.println("客户端连接成功");
		//读取客户端发送过来的内容
		InputStream in = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = in.read(bs, 0, bs.length);
		System.out.println(new String(bs, 0,len));
		//反馈给客户端信息
		OutputStream out = client.getOutputStream();
		out.write("server已经收到了你的消息".getBytes());
		//关闭流
		out.close();
		in.close();
		client.close();
		server.close();
		
	}

}
