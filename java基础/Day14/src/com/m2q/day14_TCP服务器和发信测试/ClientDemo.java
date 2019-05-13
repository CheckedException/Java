package com.m2q.day14_TCP服务器和发信测试;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建客户端对象
		Socket client = new Socket("127.0.0.1", 2555);
		//发送数据给服务器
		client.getOutputStream().write("可以吗".getBytes());
		//接收服务器反馈
		InputStream in = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = in.read(bs);
		System.out.println("收到服务器反馈"+ new String(bs, 0, len));
		//关闭Socket
		client.close();
	}

}
