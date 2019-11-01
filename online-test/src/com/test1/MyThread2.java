package com.test1;

public class MyThread2 implements Runnable {
	int x, y;

	public void run() {
		for (int i = 0; i < 1000; i++)
			synchronized (this) {
				x = 12;
				y = 12;
			}
		System.out.print(x + " " + y + " ");
	}

	public static void main(String args[]) {
		MyThread2 run = new MyThread2();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();
	}

}
