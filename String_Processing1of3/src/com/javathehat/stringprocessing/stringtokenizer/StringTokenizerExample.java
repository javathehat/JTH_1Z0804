package com.javathehat.stringprocessing.stringtokenizer;

import java.util.StringTokenizer;

/**
 * @author kontakt@javathehat.com 
 */
public class StringTokenizerExample {
	
	public static void main(String[] args){
		
		StringTokenizerExample ste = new StringTokenizerExample();
		ste.StringTokenizerTest();
		
	}
	
	public void StringTokenizerTest(){
		
		StringTokenizer st1 = new StringTokenizer("Raz1dwa trzy 7cztery"); //Domyslnym delimiterem sa biae znaki
		System.out.println(st1.countTokens()); //zwroci 3
		System.out.println(st1.nextToken("1"));// zwroci "Raz";
		System.out.println(st1.nextToken("1"));// zwroci "dwa trzy 7cztery", tylko jezeli poprzednia linijka tez sie wykonala
		System.out.println(st1.nextToken(" "));// jezeli poprzednie 2 linijki sie wykonaly to zwroci NoSuchElementException, poniewaz poslugujac sie poprzednim delimiterem doszlismy juz do ostatniego tokenu, nie mozemy dzielic od nowa z innym delimiterem.
		
		StringTokenizer st2 = new StringTokenizer("Ala5Maja6Wieska7 Gienia8Ola","\\d");//zaden konstruktor StringTokenizer nie przyjmuje wyrazenia regularnego jako delimiter. Taki zapis skompiluje sie, ale argument"\\d" bedzie interpetowany doslownie a nie jako dowolna cyfra.
		System.out.println(st2.countTokens()); //zwroci 1
		System.out.println(st2.nextToken()); //zwroci caly string "Ala5Maja6Wieska7 Gienia8Ola"
	}
	
}
