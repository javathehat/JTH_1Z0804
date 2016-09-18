package com.javathehat.threads1.runnable;

/**
 * 
 * @author javathehat.com
 *
 */
public class SampleRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("1");
		System.out.println("2");
		System.out.println(Thread.currentThread().getName());
	}

}
