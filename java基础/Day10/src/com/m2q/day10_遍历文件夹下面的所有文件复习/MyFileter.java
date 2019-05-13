package com.m2q.day10_遍历文件夹下面的所有文件复习;

import java.io.File;
import java.io.FileFilter;

public class MyFileter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if (pathname.getName().endsWith(".txt")) {
			return true;
		}
		return false;
	}

}
