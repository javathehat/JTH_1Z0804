package com.javathehat.stringprocessing.string;

import java.util.Arrays;

/**
 * @author kontakt@javathehat.com 
 */
public class StringExample {

	public static void main(String[] args) {

		StringExample se = new StringExample();
//		se.indexOfTest();
//		se.lastIndexOfTest();
//		se.containsTest();
//		se.substringTest();
//		se.splitTest();
		se.replaceXXXMethodsTest();
		
	}
	
	public void indexOfTest(){
		
		String text = "Ala ma kota, a kot ma Alę, Ala go kocha, a kot ją wcale";

		System.out.println(text.indexOf("A")); // zwróci 0
		System.out.println(text.indexOf(" "));  // zwróci 3
		System.out.println(text.indexOf("kot"));  // zwróci 7, zwróć uwagę, że jest to początek słowa 'kota', 
									 //a my szukamy tylko ciągu 'kot', w tej sytuacji wyrazy nie mają znaczenia.
		System.out.println(text.indexOf("Kot")); //Zwróci -1, wielkość liter ma znaczenie
		
		System.out.println(text.indexOf("kot",50));//Zwróci -1, szukana fraza istnieje w przeszukiwanym stringu
												  //ale my rozpoczynamy szukanie od pozycji 50,
												//po 50 znaku nie ma już ciągu 'kot'
		System.out.println(text.indexOf("ma",-100));//Zwróci 4, jak najbardziej możemy podać ujemny index.
		System.out.println(text.indexOf("kot",2000));//Zwróci -1, O dziwo, nie zakończy się wyjątkiem IndexOutOfBoundException
		
	}
	
	public void lastIndexOfTest(){
		
		String text = "Kasia, Asia i Basia i znowu Kasia";

		System.out.println(text.lastIndexOf("Kasia"));// Zwróci 28 - początek drugiego wyrazu "Kasia"
		System.out.println(text.lastIndexOf("K")); // zwróci 0
		System.out.println(text.lastIndexOf("K",10)); // zwróci 0, drugi argument działa tu odwrotnie niż w metodzie indexOf
													// W tym przykładzie ciąg "K" szukany jest między pozycją 0 a 10.
		System.out.println(text.lastIndexOf("K",-2));//zwróci -1, taki zapis jest dozwolony,
													// teoretycznie oznacza, że mamy szukać "K" nie dalej niż do pozycji -2
													// ponieważ znaki zaczynają się od pozycji 0, ciąg nie jest przeszukiwany i zwracane jest -1
		System.out.println(text.lastIndexOf("Asia",8));//Zwróci 7, zauważ, że ciąg "Asia zaczyna się na 7 pozycji, ale kończy na 10,
													 //10 wykracza poza podany zakres wyszukiwania
													// Ale metody indexOf i lastIndexOf zwracają zawsze pozycję początkową szukanego ciągu
													// W tym przypadku jest to 7 i mieści się w podanym zakresie.
	
		
	}
	
	public void containsTest(){
		
		String text = "Co mi pan tutaj namalował?";
		String tutaj = "tutaj";
		
		System.out.println(text.contains(tutaj));//zwróci true, naturalnie można przekazać do metody wartość z innych obiektów.
		System.out.println(text.contains("Pan"));// Zwróci false, wielkość liter ma znaczenie.
		//System.out.println(text.contains('C')); // Nie skompiluje się.
	}
	
	public void substringTest(){
		
		String text = "0123456789";
		
		System.out.println(text.substring(5));// Zwróci "56789" - od pozycji 5 do końca stringa
		System.out.println(text.substring(5,9));// Zwróci "5678" - od pozycji 5 do pozycji (9-1)=8
		System.out.println(text.substring(9));// Zwróci "9" - od pozycji 9 do końca stringa
		System.out.println(text.substring(9,10));// Zwróci "9" - od pozycji 9 do (10-1)=9, nie będzie IndexOutOfBoundException, mimo, że 10 wykracza poza długość stringa
		System.out.println(text.substring(10));// UWAGA, NIE zwróci IndexOutOfBoundException, zwróci pusty ciąg
		System.out.println(text.substring(11));// Zwróci IndexOutOfBoundException
		
	}
	
	//Metoda pomocnicza, żeby kod był czytelniejszy
	private void printArray(Object[] array){
		System.out.println(Arrays.asList(array).toString());
	}
	
	public void splitTest(){
		
		String text = "K O P Y T K O";
		
		printArray(text.split(" ")); // Zwróci tablicę: [K, O, P, Y, T, K, O]
		printArray(text.split("T")); // Zwróci tablicę: [K O P Y ,  K O]
		printArray(text.split("\\d"));// Zwróci jedno elementową tablicę [K O P Y T K O], "\\d" to wyrażenie regularne oznaczające cyfry, 
									// w naszej tablicy nie ma cyfr, więc string nie zostanie podzielony
		printArray(text.split(" ",1)); // Zwróci jedno elementową tablicę [K O P Y T K O], ponieważ ustaliliśmy limit 1 miejsca w zwracanej tablicy,
									// a na ostatnim (a tym przypakdu jedynym) miejscu zwracanej tablicy musi się znaleźć reszta niepodzielonego ciągu
		printArray(text.split(" ",0)); // Zwróci tablicę: [K, O, P, Y, T, K, O], limit 0 jest równoznaczny z brakiem limitu
		printArray(text.split(" ",-1)); // Zwróci tablicę: [K, O, P, Y, T, K, O], ujemny limit również jest równoznaczny z brakiem limitu
		printArray(text.split("[A-Z]"));// Zwróci tablicę: [,  ,  ,  ,  ,  ,  ] (same spacje), [A-Z] to wyrażenie regularne oznaczające duże litery z zakresu A-Z czyli cały alfabet.
	}
	
	public void replaceXXXMethodsTest(){
		
		String text = "Dwa kopytka i pieróg";
		
//		System.out.println(text.replace('i', "oraz"));// Nie skompiluje się, nie można zamienić char na string, tylko char na char
		System.out.println(text.replace('i', '&')); // Zwróci "Dwa kopytka & pieróg"
		System.out.println(text.replace(" ", "-"));// Zwróci "Dwa-kopytka-i-pieróg" - podmieniane są wszystkie znaki pasujące do podanego argumentu, a nie tylko jeden.
		System.out.println(text.replace("[a-z]", "1")); //Zwróci niezmieniony string "Dwa kopytka i pieróg". W pierwszym argumencie podaliśmy wyrażenie regularne, ale metoda replace nie próbuje interpretować pierwszego argumentu jako wyrażenie.
		System.out.println(text.replaceAll("[a-z]", "1")); //Zwróci "D11 1111111 1 1111ó1", zgodnie z podanym wyrażeniem małe litery zostały zamienione na "1". Zwróć uwagę, że polskie "ó" nie należy do zakresu [a-z]
		System.out.println(text.replaceFirst(" ", "--")); //Zwróci "Dwa--kopytka i pieróg" - tylko pierwsza spacja została podmieniona
//		System.out.println(text.replaceFirst('D', 'd')); // Nie skompiluje się, metoda replaceFirst przyjmuje tylko typ String jako argumenty.
		
	}
	


}
