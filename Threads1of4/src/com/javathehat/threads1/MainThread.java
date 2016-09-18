package com.javathehat.threads1;

/**
 * 
 * @author javathehat.com
 *
 */
public class MainThread {

	public static void main(String[] args) {
		
		System.out.println("HelloWorld");
		
		String threadName = Thread.currentThread().getName();
		
		System.out.println("Thread name = " + threadName);
		
	}

}
