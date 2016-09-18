package com.javathehat.threads1.thread;

/**
 * 
 * @author javathehat.com
 *
 */
public class SampleBadThread extends Thread {
	
	public void run(){
		System.out.println("Watek: " + Thread.currentThread().getName());
	}
	
	public void start(){
		run();
	}

}
