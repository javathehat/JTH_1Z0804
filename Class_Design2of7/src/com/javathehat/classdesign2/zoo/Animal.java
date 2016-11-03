package com.javathehat.classdesign2.zoo;
/**
 * @author kontakt@javathehat.com
 */
public class Animal {
	
	protected String name = "Animal";
	
	public Animal(String name){
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name + " is eating");
	}
	
	public static void sleep(){
		System.out.println("Animal is sleeping");
	}
	
}
