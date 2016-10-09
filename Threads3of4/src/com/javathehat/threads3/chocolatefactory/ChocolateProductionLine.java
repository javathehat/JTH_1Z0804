package com.javathehat.threads3.chocolatefactory;

/**
 * @author javathehat.com
 */
public class ChocolateProductionLine extends Thread {

	public void run(){
		
		new Chocolate();
		
	}
}
