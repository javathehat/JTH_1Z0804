package com.javathehat.classdesign2.zoo;
/**
 * @author kontakt@javathehat.com
 */
public class Lion extends Animal{
	
	public Lion() {
		super("Lion");
	}
	
	public void eat(){
		System.out.println(name + " is eating monkey");
	}
	
}
