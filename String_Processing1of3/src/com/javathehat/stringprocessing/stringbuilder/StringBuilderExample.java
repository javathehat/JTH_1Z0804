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
		System.out.println(sb1.capacity()); //Zwraca 16, domyślna pojemność StringBuildera
		
		StringBuilder sb2 = new StringBuilder("Grzegorz");
		System.out.println(sb2.capacity()); //Zwraca 24, czyli domyślne 16 + 8 znaków podanego w konstruktorze ciągu.
		
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3.toString());// Zwraca pusty ciąg znaków, w konstruktorze podaliśmy inta czyli pojemność, a nie inicjalną treść obiektu.
		System.out.println(sb3.capacity()); //Zwraca 10
		sb3.append("1");
		System.out.println(sb3.capacity()); //Zwraca 10, po zainicjowaniu pojemność jest zwiększa już tylko jeśli osiągniemy jej limit
	
		sb3.append(sb2).append("tekst").append(sb3); //Do metody append możemy podać innego StringBuildera, możemy również poać tego samego StringBuildera, na którym wołamy metodę append.
		System.out.println(sb3); // zwróci "1Grzegorztekst1Grzegorztekst"
	}

}
