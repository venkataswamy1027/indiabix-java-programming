package com.test1;

public class MathOpCeilTest {

	public static void main(String args[]) {
		double a = 4.3;
		double b = 1.0 / 0;
		double c = 0.0;
		double d = -0.0;
		double e = -0.12;

		System.out.println(Math.ceil(a));

		// Input Infinity, Output Infinity
		System.out.println(Math.ceil(b));

		// Input Positive Zero, Output Positive Zero
		System.out.println(Math.ceil(c));

		// Input Negative Zero, Output Negative Zero
		System.out.println(Math.ceil(d));

		// Input less than zero but greater than -1.0
		// Output Negative zero
		System.out.println(Math.ceil(e));
	}

}
