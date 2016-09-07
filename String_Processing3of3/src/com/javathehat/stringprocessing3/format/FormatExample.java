package com.javathehat.stringprocessing3.format;

/**
 * 
 * @author kontakt@javathehut.com
 *
 */
public class FormatExample {


	public static void main(String[] args) {

		FormatExample fe = new FormatExample();
//		fe.formatTest01();
		fe.formatTest02();
		
	}
	
	public void formatTest01(){
		
		String name = "Roman";
		String phone = "500 900 909";
		String formattedText = String.format("Imie: %s, Telefon: %s", name,phone);
		
		System.out.println(formattedText);
	}
	
	public void formatTest02(){
		
		String name = "Yayami";
		String sureName = "Omate";
		double salary = 6521.99d;
			
		String formattedText = String.format("Pracownik: %2$-15s %1$20s, pensja: %3$.2f", name,sureName, salary);
		
		System.out.println(formattedText);
	}

}
