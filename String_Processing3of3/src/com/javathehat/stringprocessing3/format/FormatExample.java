package com.javathehat.stringprocessing3.format;

/**
 * 
 * @author kontakt@javathehut.com
 *
 */
public class FormatExample {


	public static void main(String[] args) {

//		Odkometuj jedno z wywolan metod, zeby przetestowac dany przyklad
		FormatExample fe = new FormatExample();
//		fe.formatTest01();
//		fe.formatTest02();
		fe.formatTest03();
		
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
	
	public void formatTest03(){
		
		String arg1_s = "Johny";
		String arg2_s = "Goldborn";
		int arg3_d = -32;
		double arg4_f = 128.500d;
		boolean arg5_b = false;
		
		String result;
		
		//Podstawowe formatowanie, nie musimy wykorzystac wszyskich podanych do metody obiektów
		result = String.format("Imie: %s \nNazwisko: %s \nwiek: %d",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result);// Imie: Johny 
								// Nazwisko: Goldborn 
								// wiek: -32
		
		//Ten sam obiekt mozemy wykorzystac wielokrotnie
		result = String.format("Dwa razy imie: %s , %1$s",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result);// Dwa razy imie: Johny , Johny
		
		//Liczba calkowita ujemna zapisana w nawiasie zamiast z minusem, dopelniona zerami do 6 miejsc
		result = String.format("%3$(06d",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result);// (0032)
		
		//Liczba zmienno przecinkowa na 10 miejscach, z precyzja 3, dopelniona zerami, ze znakiem, z lokalym formatowaniem przecinkow
		result = String.format("%4$+0,10.3f",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result); // +00128,500
		
		//String na 30 znakach dopelnion spacjami od lewej
		result = String.format("\"%30s\"",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result); // "                         Johny"
		
		//String na 30 znakach dopelnion spacjami od prawej
		result = String.format("\"%-30s\"",arg1_s,arg2_s,arg3_d,arg4_f,arg5_b);
		System.out.println(result); // "Johny                         "
		
		//Warunek logiczny
		result = String.format("%b %b",arg1_s.isEmpty(), arg3_d < 100);
		System.out.println(result);//false true
		
		//Przekazanie inta do znaku konwersji = b
		result = String.format("%b",0);
		System.out.println(result);//true
		
		//Przekazanie nulla do znaku konwersji = b
		result = String.format("%b",null);
		System.out.println(result);//false
		
		//Przekazanie nulla do znaku konwersji = d
		result = String.format("%d",null);
		System.out.println(result);//null
		
	}

}
