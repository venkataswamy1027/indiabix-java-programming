package com.test1;

public class ExceptionTest {

	public static void aMethod() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.print("finally ");
		}
	}

	public static void main(String args[]) {
		try {
			aMethod();
		} catch (Exception e) {
			System.out.print("exception ");
		}
		System.out.print("finished");
	}

}
