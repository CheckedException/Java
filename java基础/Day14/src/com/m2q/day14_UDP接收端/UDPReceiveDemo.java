package com.m2q.day14_UDP接收端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建DatagramScoket对象
		DatagramSocket ds = new DatagramSocket(12345);
		while(true){
		//创建DatagramPacket对象
		byte[] bs = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bs, bs.length);
		System.out.println("等待发送端发送数据");
		ds.receive(dp);
		System.out.println("接收数据成功");
		InetAddress Itaddress = dp.getAddress();
		System.out.println("发送端是" + Itaddress.getHostAddress() );
		int len = dp.getLength();
		byte[] s = dp.getData();
		String content = new String(s,0,len);
		System.out.println("发送的内容是:"+content);
		}
		//ds.close();
	}

}
