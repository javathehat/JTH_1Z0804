package com.javathehat.threads3.synchronize;

/**
 * @author javathehat.com
 */
public class SynchronizedObject {
	
	static int counter = 0;
	
	synchronized public void  incrementCounter(){
		counter = counter +1;
		System.out.println(counter);
	}
	

}
