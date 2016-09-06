package com.javathehat.stringprocessing.formatter;

import java.util.Formatter;
import java.util.Locale;

/**
 * @author kontakt@javathehat.com 
 */
public class FormatterExample {
	
	public static void main(String[] args){
		
		FormatterExample fe = new FormatterExample();
		
		fe.formatterTest();
	}
	
	public void formatterTest(){
		
		Formatter f;
		
		String text = "Konstantynopolitanczykowianeczka";
		
		f = new Formatter();
		System.out.println(f.format("%b", text)); //Zwróci true, mimo, że użyliśmy stringa, to znacznik %b będzie rzutował tego stringa na typ boolean
		
		f = new Formatter();
		System.out.println(f.format("%b", null)); //Zwróci false;
		
		f = new Formatter();
		System.out.println(f.format("%b", new Boolean("TrUe"))); //Zwróci true, przy okazji warto zauważyć, że w konstruktorze Boolean wielkość liter nie ma znaczenia
	
		f = new Formatter();
		System.out.println(f.format("%b", -10)); //Zwróci true
	
		f = new Formatter();
		System.out.println(f.format(Locale.UK,"%f", 1234.99d)); //Zwróci 1234.990000 dla Locale United Kingdom separatorem dzisiętnym jest kropka
		
		f = new Formatter();
		System.out.println(f.format(Locale.CANADA_FRENCH,"%f", 1234.99d));// Zwróci 1234,990000, dla Locale Kanady separatorem jest przecinek
		
		f = new Formatter();
//		System.out.println(f.format(Locale.CANADA_FRENCH,"%d", 1234.99d)); // Zwróci wyjątek IllegalFormatConversionException. Znacznik %d oznacza liczbę całkowitą i niedopuszczalne jest podanie dla niego typu float lub double
	
		
		//Dlaczego przed każdym formatowaniem inicjuje na nowo formatter?
		//Jeśli wywołasz na jednym obiekcie typu Formatter metodę format kilka razy, jej rezultaty będą się do siebie dodawać:
		f = new Formatter();
		f.format("Wywyłanie metody nr: %d ", 1);
		f.format("Wywyłanie metody nr: %d ", 2);
		
		System.out.println(f.toString()); // zwróci "Wywyłanie metody nr: 1 Wywyłanie metody nr: 2 "
	
	}

}
