package com.javathehat.stringprocessing.string;

import java.util.Arrays;

/**
 * @author kontakt@javathehat.com 
 */
public class StringExample {

	public static void main(String[] args) {

//		Odkomentuj jedno z wywolan metod zeby przetestowac jej dzialanie
		StringExample se = new StringExample();
//		se.indexOfTest();
//		se.lastIndexOfTest();
//		se.containsTest();
//		se.substringTest();
//		se.splitTest();
//		se.replaceXXXMethodsTest();
		
	}
	
	public void indexOfTest(){
		
		String text = "Ala ma kota, a kot ma Ale, Ala go kocha, a kot ja… wcale";

		System.out.println(text.indexOf("A")); // zwroci 0
		System.out.println(text.indexOf(" "));  // zwroci 3
		System.out.println(text.indexOf("kot"));  // zwroci 7, zwroc uwage, ze jest to poczatek jednego slowa 'kota', a my szukamy tylko ciagu 'kot', w tej sytuacji wyrazy nie maja… znaczenia.
		System.out.println(text.indexOf("Kot")); //zwroci -1, wielkosc liter ma znaczenie
		
		System.out.println(text.indexOf("kot",50));//zwroci -1, szukana fraza istnieje w przeszukiwanym stringu, ale my rozpoczynamy szukanie od pozycji 50, po 50 znaku nie ma juz ciagu 'kot'
		System.out.println(text.indexOf("ma",-100));//zwroci 4, jak najbardziej mozemy podac ujemny index.
		System.out.println(text.indexOf("kot",2000));//zwroci -1, O dziwo, nie zakonczy sie wyjatkiem IndexOutOfBoundException
		
	}
	
	public void lastIndexOfTest(){
		
		String text = "Kasia, Asia i Basia i znowu Kasia";

		System.out.println(text.lastIndexOf("Kasia"));// zwroci 28 - paczatek drugiego wyrazu "Kasia"
		System.out.println(text.lastIndexOf("K")); // zwroci 0
		System.out.println(text.lastIndexOf("K",10)); // zwroci 0, drugi argument dziala tu odwrotnie niz w metodzie indexOf,w tym przykladzie ciag "K" szukany jest miedzy pozycja 0 a 10.
		System.out.println(text.lastIndexOf("K",-2));//zwroci -1, taki zapis jest dozwolony, teoretycznie oznacza, ze mamy szukac "K" nie dalej niz do pozycji -2, poniewaz znaki zaczynaja sie od pozycji 0, ciag nie jest przeszukiwany i zwracane jest -1
		System.out.println(text.lastIndexOf("Asia",8));//zwroci 7, zauwaz, ze ciag "Asia: zaczyna sie na 7 pozycji, ale konczy na 10. 10 wykracza poza podany zakres wyszukiwania.  Ale metody indexOf i lastIndexOf zwracaja zawsze pozycje poczatkowa szukanego ciagu. W tym przypadku jest to 7 i miesci sie w podanym zakresie.
	
		
	}
	
	public void containsTest(){
		
		String text = "Co mi pan tutaj namalowal?";
		String tutaj = "tutaj";
		
		System.out.println(text.contains(tutaj));//zwroci true, naturalnie mozna przekazac do metody wartosc z innych obiektow
		System.out.println(text.contains("Pan"));// zwroci false, wielkosc liter ma znaczenie.
		//System.out.println(text.contains('C')); // Nie skompiluje sie.
	}
	
	public void substringTest(){
		
		String text = "0123456789";
		
		System.out.println(text.substring(5));// zwroci "56789" - od pozycji 5 do konca stringa
		System.out.println(text.substring(5,9));// zwroci "5678" - od pozycji 5 do pozycji (9-1)=8
		System.out.println(text.substring(9));// zwroci "9" - od pozycji 9 do konca stringa
		System.out.println(text.substring(9,10));// zwroci "9" - od pozycji 9 do (10-1)=9, nie bedzie IndexOutOfBoundException, mimo, ze 10 wykracza poza dlugosc stringa
		System.out.println(text.substring(10));// UWAGA, NIE zwroci IndexOutOfBoundException, zwroci pusty ciag
		System.out.println(text.substring(11));// zwroci IndexOutOfBoundException
		
	}
	
	//Metoda pomocnicza, zeby kod byl czytelniejszy
	private void printArray(Object[] array){
		System.out.println(Arrays.asList(array).toString());
	}
	
	public void splitTest(){
		
		String text = "K O P Y T K O";
		
		printArray(text.split(" ")); // zwroci tablice™: [K, O, P, Y, T, K, O]
		printArray(text.split("T")); // zwroci tablice™: [K O P Y ,  K O]
		printArray(text.split("\\d"));// zwroci jedno elementowa tablice  [K O P Y T K O], "\\d" to wyrazenie regularne oznczajace cyfry, w naszej tablicy nie ma cyfr, wiec string nie zostanie podzielony
		printArray(text.split(" ",1)); // zwroci jedno elementowa tablice [K O P Y T K O], poniewaz ustalilismy limit jednego miejsca w zwracanej tablicy, a na ostatnim (a tym przypakdu jedynym) miejscu zwracanej tablicy musi sie znalezc reszta niepodzielonego ciagu
		printArray(text.split(" ",0)); // zwroci tablice: [K, O, P, Y, T, K, O], limit 0 jest rownowazny z brakiem limitu
		printArray(text.split(" ",-1)); // zwroci tablice: [K, O, P, Y, T, K, O], ujemny limitrwniez jest rownowazny z brakiem limitu
		printArray(text.split("[A-Z]"));// zwroci tablice™: [,  ,  ,  ,  ,  ,  ] (same spacje), [A-Z] to wyrazenie regularne oznaczajace duze litery z zakresu A-Z czyli caly alfabet.
	}
	
	public void replaceXXXMethodsTest(){
		
		String text = "Dwa kopytka i pierog";
		
//		System.out.println(text.replace('i', "oraz"));// Nie skompiluje sie, nie mozna zamienic char na string, tylko char na char
		System.out.println(text.replace('i', '&')); // zwroci "Dwa kopytka & pierog"
		System.out.println(text.replace(" ", "-"));// zwroci "Dwa-kopytka-i-pierog" - podmieniane sa wszystkie znaki pasujace do podanego argumentu, a nie tylko jeden.
		System.out.println(text.replace("[a-z]", "1")); //zwroci niezmieniony string "Dwa kopytka i pierog". W pierwszym argumencie podalismy wyrazenie regularne, ale metoda replace nie probuje interpretowac pierwszego argumentu jako wyrazenie.
		System.out.println(text.replaceAll("[a-z]", "1")); //zwroci "D11 1111111 1 111111", zgodnie z podanym wyrazeniem male litery zostaly zamienione na "1".
		System.out.println(text.replaceFirst(" ", "--")); //zwroci "Dwa--kopytka i pierog" - tylko pierwsza spacja zostala podmieniona
//		System.out.println(text.replaceFirst('D', 'd')); // Nie skompiluje sie, metoda replaceFirst przyjmuje tylko typ String jako argumenty.
		
	}
	


}
