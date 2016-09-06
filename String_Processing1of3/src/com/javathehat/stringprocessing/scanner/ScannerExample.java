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
		
		s = new Scanner("Abra 1 1d Kadabra 2 ala 3 kazam!"); //Domyślnym dleimiterem jest spacja.
		System.out.println(s.hasNextInt());// Zwróci false, następny (pierwszy) token jest Stringiem;
		s.next(); //Pobieramy pierwszy token i nic z nim nie robimy;
		System.out.println(s.next()); //Mimo, że kolejnym tokenem będzie "1", który da się rzutować na int, bez problemu możemy pobrać go jako string
		System.out.println(s.hasNextInt()); // zwróci false, następnym tokenem jest "1d". Nie da sie go rzutować na int.
		
		s = new Scanner("1 R 2 A 3 D 4 E 5 K");
		s.useDelimiter("\\d\\s"); //delimiterem jest dwuznakowy ciąg "dowolna cyfra plus biały znak (np spacja)"
		System.out.println(s.hasNextInt()); // Zwróci false, mimo, że pierwszym znakiem jest '1', wszystkie cyfry interpretujemy jako delimitery, więc żadna z nich nie będzie tokenem
		System.out.println(s.nextInt()); //Jeśli jednak spróbujemy pobrać inta, zwrócony zostanie wyjątek InputMismatchException.
	}

}
