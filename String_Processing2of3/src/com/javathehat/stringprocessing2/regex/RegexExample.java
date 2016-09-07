package com.javathehat.stringprocessing2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kontakt@javathehat.com 
 */
public class RegexExample {

	
	public static void main(String[] args) {

//		Odkomentuj dowolne z wywolan metod, zeby sprawdzic ich dzialanie
		RegexExample re = new RegexExample();
//		re.regexTest01();
//		re.regexTest02();
//		re.regexTest03();
//		re.regexTest04();
//		re.regexTest05();
//		re.regexTest06();
		
	}
	
	public void regexTest01(){
		
		String text = "10-001";
		
		String[] regex = {
						"\\d", //cyfra
						"\\d+", //jedna lub wiecej cyfr
						"\\d\\d-\\d\\d\\d", //walidacja na kod pocztowy - sposob 1
						"\\d{2}-\\d{3}" ,//walidacja na kod pocztowy - sposob 2
						"[0-9]{2}-[0-9]{3}", //walidacja na kod pocztowy - sposob 3
						"\\b\\d{2}-\\d{3}\\b", ////walidacja na kod pocztowy - sposob 4
						"^\\d{2}-\\d{3}$" ////walidacja na kod pocztowy - sposob 5
						};
		
		Pattern p = Pattern.compile(regex[6]); //podaj odpowiedni index tablicy regex, aby przetestowac konkretne wyrazenie
		Matcher m = p.matcher(text);
		
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	/**
	 *Przyklad z artykulu, walidacja pliku z danymi klienta.
	 */
	public void regexTest02(){
		
		String textGood = "12345678|Waldemar|Wujtowicz|waldus_w@gmail.com|(+48)900800700#";
		String textBad = "12345678|Waldemar|Wujtowicz|waldus_w@gmail.com|(900800700#";
		
		String regex = "^[\\d]{8}\\|[a-zA-Z]+\\|[a-zA-Z]+\\|([\\w]+[-_]?[\\w]*)+@[\\w]+.[\\w]+\\|\\(\\+48\\)[\\d]{9}#$";
		
		Pattern p = Pattern.compile(regex);
		
		//odkomentuj przyklad z prawidlowym lub blednym stringiem
//		Matcher m = p.matcher(textGood);
		Matcher m = p.matcher(textBad);
		
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	/**
 	* Zliczanie zdan w teksie, zakladajac, ze kazde zdanie oddzielone jest znakiem kropki
	*/
	public void regexTest03(){
		
		String text = "To jest pierwsze zdanie. A to jest drugie zdanie. Jest jeszcze trzecie zdanie.";
		
		String regex = "[\\w\\s]*\\.";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		System.out.println(m.groupCount());
	}
	
	/**
	 * Wskazanie pozycji kazdego numeru telefonu zakladajac, ze telefonem jest kazde 9 cyfr w formacie:
	 * 3 cyfry spacja 3 cyfry spacja 3 cyfry
	 */
	public void regexTest04(){
		
		String text = "Agata:800 900 700, Stefan:789 852 123, Zenon:745 563 215 ";
		
		String regex = "[\\d]{3}\\s[\\d]{3}\\s[\\d]{3}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		while(m.find()){
			System.out.println(m.start());
		}
	}
	
	/**
	 * Sprawdzenie czy kazdy wyraz w stringu zaczyna sie duza litera
	 */
	public void regexTest05(){
		
		String text = "Id Etre Nosten Toro Mine Atulis Manore";
		
		String regex = "^([A-Z][a-z]+\\s*)*$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
	
	/**
	 * Zakres zwracany przez metody start() oraz end()
	 */
	public void regexTest06(){
		
		String text = "Kot";// 'K' ma index 0, 'o' ma index 1, 't' ma index 2, dlugosc slowa = 3 
		
		String regex = "\\w*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			System.out.println("ciag: " + m.group());
			System.out.println("start: " + m.start());
			System.out.println("end: " + m.end());
			System.out.println("dlugosc ciagu: " + m.group().length());
		}
	}

}
