package com.m2q.day05_静态代理涉及模式;

public class TestClass {
	String name ;
	int a;

	@Override
	public String toString() {
		return "TestClass [name=" + name + ", a=" + a + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass other = (TestClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
