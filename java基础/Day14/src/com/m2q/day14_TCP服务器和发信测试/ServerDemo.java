package com.m2q.day14_TCP服务器和发信测试;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建server端对象
		ServerSocket server = new ServerSocket(2555);
		System.out.println("等待客户端连接");
		Socket client = server.accept();
		System.out.println(client.getInetAddress().getHostAddress()+"连接成功");
		//获取传进来的数据
		InputStream content = client.getInputStream();
		System.out.println("获取数据成功");
		//读取客户端发送的数据
		byte[] bt = new byte[1024];
		content.read(bt);
		System.out.println(new String(bt, 0, bt.length));
		//反馈给客户端消息
		OutputStream out  = client.getOutputStream();
		out.write("你的消息已经收到了".getBytes());
		content.close();
		client.close();
		server.close();
	}

}
