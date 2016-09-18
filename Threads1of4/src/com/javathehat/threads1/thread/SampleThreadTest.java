package com.javathehat.threads1.thread;

/**
 * 
 * @author javathehat.com
 *
 */
public class SampleThreadTest {
	
	public static void main(String[] args) {
		
		SampleThread sampleThread1 = new SampleThread();
		SampleThread sampleThread2 = new SampleThread();
		
		sampleThread1.start();
		sampleThread2.start();
	}

}
