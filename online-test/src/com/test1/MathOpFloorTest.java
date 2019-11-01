package com.test1;

public class MathOpFloorTest {

	public static void main(String args[]) {
		double a = 4.56;
		double b = 1.0 / 0;
		double c = 0.0;
		double d = -0.0;
		double e = -0.12;

		System.out.println(Math.floor(a));

		System.out.println(Math.floor(b));

		System.out.println(Math.floor(c));

		System.out.println(Math.floor(d));

		System.out.println(Math.floor(e));
	}

}
