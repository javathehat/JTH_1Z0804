package com.javathehat.threads1.thread;

/**
 * 
 * @author javathehat.com
 *
 */
public class SampleThread extends Thread{
	
	public void run(){
		
		for(int i = 1; i <=3;  i++){
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}

}
