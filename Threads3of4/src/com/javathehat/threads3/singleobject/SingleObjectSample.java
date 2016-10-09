package com.javathehat.threads3.singleobject;

import com.javathehat.threads3.chocolatefactory.ChocolateProductionLine;

/**
 * @author javathehat.com
 */
public class SingleObjectSample {

	public static void main(String[] args) {
		
		SingleObject singleObject = new SingleObject();

		for(int i = 0; i<5; i++ ){
			
			new SampleThread(singleObject).start();
			
		}
	}

}

class SampleThread extends Thread{
	
	SingleObject singleObject;
	
	SampleThread(SingleObject singleObject){
		this.singleObject = singleObject;
	}
	
	public void run(){
		singleObject.incrementIntValue();
	}
}
