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
		System.out.println(f.format("%b", text)); //Zwroci true, mimo, ze uzylismy stringa, to znacznik %b bedzie rzutowac tego stringa na typ boolean
		
		f = new Formatter();
		System.out.println(f.format("%b", null)); //Zwroci false;
		
		f = new Formatter();
		System.out.println(f.format("%b", new Boolean("TrUe"))); //Zwroci true, przy okazji warto zauwazyc, ze w konstruktorze Boolean wielkosc liter nie ma znaczenia
	
		f = new Formatter();
		System.out.println(f.format("%b", -10)); //Zwroci true
	
		f = new Formatter();
		System.out.println(f.format(Locale.UK,"%f", 1234.99d)); //Zwroci 1234.990000 dla Locale United Kingdom separatorem dziesietnym jest kropka
		
		f = new Formatter();
		System.out.println(f.format(Locale.CANADA_FRENCH,"%f", 1234.99d));// Zwroci 1234,990000, dla Locale Kanady separatorem jest przecinek
		
		f = new Formatter();
//		System.out.println(f.format(Locale.CANADA_FRENCH,"%d", 1234.99d)); // Zwroci wyjatek IllegalFormatConversionException. Znacznik %d oznacza liczbe calkowita i niedopuszczalne jest podanie dla niego typu float lub double
	
		
		//Dlaczego przed kazdym formatowaniem inicjuje na nowo formatter?
		//Jezeli wywolamy na jednym obiekcie typu Formatter metode format kilka razy, jej rezultaty beda sie do siebie dodawac
		f = new Formatter();
		f.format("Wywolanie metody nr: %d ", 1);
		f.format("Wywolanie metody nr: %d ", 2);
		
		System.out.println(f.toString()); // Zwroci "Wywolanie metody nr: 1 Wywolanie metody nr: 2 "
	
	}

}
