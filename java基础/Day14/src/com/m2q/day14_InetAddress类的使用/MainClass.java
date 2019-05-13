package com.m2q.day14_InetAddress类的使用;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress iAdress = InetAddress.getLocalHost();
		System.out.println(iAdress);
		String hostName = iAdress.getHostName();
		System.out.println(hostName);
		String hostAddress = iAdress.getHostAddress();
		System.out.println(hostAddress);
		InetAddress otherInetAddress = InetAddress.getByName("www.m2q.top");
		System.out.println(otherInetAddress.getHostName() + "  " +otherInetAddress.getHostAddress());
	}

}
