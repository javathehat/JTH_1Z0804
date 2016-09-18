package com.javathehat.threads1.runnable;

import com.javathehat.threads1.thread.SampleThread;


/**
 * 
 * @author javathehat.com
 *
 */
public class SampleRunnableTest {

	public static void main(String[] args) {
		
		SampleRunnable sampleRunnable1 = new SampleRunnable();
		SampleRunnable sampleRunnable2 = new SampleRunnable();
		
		Thread thread1 = new Thread(sampleRunnable1);
		Thread thread2 = new Thread(sampleRunnable2);
		
		thread1.start();
		thread2.start();
	}
	
}
