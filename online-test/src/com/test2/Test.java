package com.test2;

public class Test {
	public static void main(String[] args) {
		String a = "newspaper";
		a = a.substring(5, 7);
		char b = a.charAt(1);
		a = a + b;
		System.out.println(a);
	}
}
