package com.javathehat.classdesign2.zoo;
/**
 * @author kontakt@javathehat.com
 */
public class Monkey extends Animal{
	
	public Monkey() {
		super("Monkey");
	}
	
	public void eat(){
		System.out.println(name + " is eating banana");
	}
	
	public static void sleep(){
		System.out.println("Monkey is sleeping");
	}
	
}
