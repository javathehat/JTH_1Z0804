package com.javathehat.classdesign3.donotdothat;

/**
 * @author kontakt@javathehat.com
 */
public class Trap {
	
	public static void printNumbers(int number1, double number2){
		System.out.println(number1 + " , " + number2);
	}
	
	public static void printNumbers(double number1, int number2){
		System.out.println(number1 + " : " + number2);
	}
	
	public static void main(String[] args){
		
//		printNumbers(10,10); //nie ksompiluje się
		printNumbers(10,(double)10);
	}
	

}
