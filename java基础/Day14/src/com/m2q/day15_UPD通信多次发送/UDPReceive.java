package com.m2q.day15_UPD通信多次发送;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建DatagramScoket对象
		DatagramSocket ds = new DatagramSocket(1553);
		while(true){

			//创建DatagramPacket对象
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			//接收数据
			System.out.println("等待对方发送数据");
			ds.receive(dp);
			InetAddress itAddress = dp.getAddress();
			System.out.println("发件者地址是:" + itAddress.getHostAddress() );
			byte[] content = dp.getData();
			String contents = new String(content, 0, content.length);
			System.out.println("发送的内容是:"+contents);
		}
	}

}
