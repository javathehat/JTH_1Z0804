package com.javathehat.threads3.singleobject;

/**
 * @author javathehat.com
 */
public class SingleObject {

	private int intValue = 0;
	
	public void incrementIntValue(){
		System.out.println("Wartość przed inkrementacją = " + intValue);
		intValue++;
		System.out.println("Wartość po inkrementacji = " + intValue);
	}
}
