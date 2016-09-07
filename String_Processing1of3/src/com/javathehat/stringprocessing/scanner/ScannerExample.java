package com.javathehat.stringprocessing.scanner;

import java.util.Scanner;

/**
 * @author kontakt@javathehat.com 
 */
public class ScannerExample {
	
	public static void main(String[] args){
		
		ScannerExample se = new ScannerExample();
		
		se.scannerTest();
	}
	
	public void scannerTest(){
		
		Scanner s;
		
		s = new Scanner("Abra 1 1d Kadabra 2 ala 3 kazam!"); //Domyslnym delimiterem jest spacja
		System.out.println(s.hasNextInt());// Zwroci false, poniewaz nastepny (pierwszy) token jest Stringiem
		s.next(); //Pobieramy pierwszy token i nic z nim nie robimy
		System.out.println(s.next()); //Mimo, ze kolejnym tokenem bedzie "1", ktory da sie rzutowac na typ int, bez problemu mozemy pobrac go jako string
		System.out.println(s.hasNextInt()); // Zwroci false, nastepnym tokenem jest "1d". Nie da sie go rzutowac na int.
		
		s = new Scanner("1 R 2 A 3 D 4 E 5 K");
		s.useDelimiter("\\d\\s"); //delimiterem jest dwuznakowy ciag "dowolna cyfra plus bialy znak (np spacja)"
		System.out.println(s.hasNextInt()); // Zwroci false, mimo, ze pierwszym znakiem jest '1', wszystkie cyfry interpretujemy jako delimitery, wiez zadna z nich nie bedzie tokenem
		System.out.println(s.nextInt()); //Jezeli jednak sprobujemy pobrac inta, zwrocony zostanie wyjatek InputMismatchException.
	}

}
