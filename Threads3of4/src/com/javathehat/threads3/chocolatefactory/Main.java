package com.javathehat.threads3.chocolatefactory;

/**
 * @author javathehat.com
 */
public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++ ){
			
			new ChocolateProductionLine().start();
			
		}
		
		System.out.println(Chocolate.producedChocolates);
	}

}
