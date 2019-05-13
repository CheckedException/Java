package com.m2q.day05.C3P0¡¨Ω”≥ÿ±‡–¥;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = C3P0Utils.getConnection();
		System.out.println(conn);
	}

}
