package com.m2q.day10_�ļ���������ʹ��;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if (pathname.getName().endsWith(".txt")) {
			return true;
		}
		return false;
	}

}
