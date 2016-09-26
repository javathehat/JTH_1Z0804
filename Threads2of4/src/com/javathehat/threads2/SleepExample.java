package com.javathehat.threads2;

/**
 * @author javathehat.com
 */
public class SleepExample extends Thread{
	
	public static void main(String[] args){
		
		SleepExample sleepExample = new SleepExample();
		
		sleepExample.start();
		
	}
	
	public void run(){
		
		for(int i = 0; i <=10; i++){
			long start = System.currentTimeMillis();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("sleep trwal: " + new Long(System.currentTimeMillis() - start));
		}
	}

}
