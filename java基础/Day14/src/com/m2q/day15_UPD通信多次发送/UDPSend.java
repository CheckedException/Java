package com.m2q.day15_UPDͨ�Ŷ�η���;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����DatagramScoket����
		DatagramSocket ds = new DatagramSocket();
		while(true){
		//����DatagramPacket����
		Scanner in = new Scanner(System.in);
		System.out.println("����������:");
		String content = in.nextLine();
		byte[] buf = content.getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),1553);
		ds.send(dp);
		System.out.println("�������ݳɹ�");
		}
	}

}
