package com.test1;

public class BooleanTest {
	static boolean a = false;
	static boolean b = true;

	public static void main(String[] args) {
		foo(a, b);

	}

	public static void foo(boolean a, boolean b) {
		if (a) {
			System.out.println("A"); /* Line 5 */
		} else if (a && b) /* Line 7 */
		{
			System.out.println("A && B");
		} else /* Line 11 */
		{
			if (!b) {
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}
	}
}
