package com.javathehat.stringprocessing.stringbuilder;

/**
 * @author kontakt@javathehat.com 
 */
public class StringBuilderExample {
	
	public static void main(String[] args){
		
		StringBuilderExample sbe = new StringBuilderExample();
		
		sbe.stringBUilderTest();
		
	}
	
	public void stringBUilderTest(){
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity()); //Zwraca 16, domyslna pojemnosc StrigBuildera
		
		StringBuilder sb2 = new StringBuilder("Grzegorz");
		System.out.println(sb2.capacity()); //Zwraca 24, czyli domyslne 16 + 8 znakow podanego w konstruktorze ciagu.
		
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3.toString());// Zwraca pusty ciag znakow, w konstruktorze podalismy inta czyli pojemnosc, a nie inicjalna wartosc obiektu.
		System.out.println(sb3.capacity()); //Zwraca 10
		sb3.append("1");
		System.out.println(sb3.capacity()); //Zwraca 10, po zainicjowaniu pojemnosc jest zwiekszana juz tylko keidy osiagniemy jej limit
	
		sb3.append(sb2).append("tekst").append(sb3); //Do metody append mozemy podac innego StringBuildera, mozemy rowniez podac tego samego StringBuildera, na ktorym wolamy append.
		System.out.println(sb3); // zwroci "1Grzegorztekst1Grzegorztekst"
	}

}
