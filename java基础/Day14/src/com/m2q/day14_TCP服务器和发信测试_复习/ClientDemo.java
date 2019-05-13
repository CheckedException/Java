package com.m2q.day14_TCP服务器和发信测试_复习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
		//创建客户端对象
		Socket client = new Socket("127.0.0.1", 2555);
		//向服务器发送数据
		client.getOutputStream().write("我爱你".getBytes());
		//接收客户端反馈
		byte[] bs = new byte[1024];
		InputStream in = client.getInputStream();
		int len = in.read(bs);
		System.out.println(new String(bs, 0, len));
		//关闭客户端流
		in.close();
		client.close();
	}

}
