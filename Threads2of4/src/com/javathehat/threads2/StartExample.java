package com.javathehat.threads2;

/**
 * @author javathehat.com
 */
public class StartExample extends Thread{
	
	public static void main(String[] args){
		
		StartExample startExample = new StartExample();
		
		startExample.start();
		startExample.start();
		
	}
	
	public void run(){
		
		System.out.println("To be...");
		System.out.println("Or not to be..");
	}

}
