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
		
		StringTokenizer st1 = new StringTokenizer("Raz1dwa trzy 7cztery"); //Domyślnym delimiterem są białe znaki
		System.out.println(st1.countTokens()); //zwróci 3
		System.out.println(st1.nextToken("1"));// Zwróci "Raz";
		System.out.println(st1.nextToken("1"));// Zwróci "dwa trzy 7cztery", tyko jeśli poprzednia linijka też się wykonała.
		System.out.println(st1.nextToken(" "));// Jeśli poprzednie 2 linijki sie wykonały, to zwróci NoSuchElementException, ponieważ posługując się poprzednim delimiterem doszliśmy już do ostatniego tokenu, nie możemy dzielić od nowa z innym delimiterem.
		
		StringTokenizer st2 = new StringTokenizer("Ala5Maja6Wieska7 Gienia8Ola","\\d");//Żaden konstruktor StringTokenizer nie przyjmuje wyrażenia regularnego jako delimiter. Taki zapis skompiluje się, ale argument"\\d" będzie interpetowany dosłownie a nie jako dowolna cyfra.
		System.out.println(st2.countTokens()); //zwróci 1
		System.out.println(st2.nextToken()); //Zwróci caly string "Ala5Maja6Wieska7 Gienia8Ola"
	}
	
}
