package com.javathehat.threads3.synchronize;

import com.javathehat.threads3.chocolatefactory.ChocolateProductionLine;

/**
 * @author javathehat.com
 */
public class SynchronizedObjectSample {

	public static void main(String[] args) {
		
		SynchronizedObject singleObject = new SynchronizedObject();

		for(int i = 0; i<5; i++ ){
			
			new SampleThread(singleObject).start();
			
		}
	}

}

class SampleThread extends Thread{
	
	SynchronizedObject singleObject;
	
	SampleThread(SynchronizedObject singleObject){
		this.singleObject = singleObject;
	}
	
	public void run(){
		singleObject.incrementCounter();
	}
}
