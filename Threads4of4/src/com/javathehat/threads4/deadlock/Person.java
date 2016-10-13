package com.javathehat.threads4.deadlock;

/**
 * @author kontakt@javathehat.com
 */
public class Person extends Thread{

	private String obj1;
	private String obj2;
	
	public Person(String obj1, String obj2,String name){
		super(name);
		this.obj1 = obj1; 
		this.obj2 = obj2; 
	}
	
	public void run(){
		synchronized(obj1){
			System.out.println(String.format("%s zabiera %s", this.getName(), obj1));
			synchronized(obj2){
				System.out.println(String.format("%s zabiera %s", this.getName(), obj2));
				System.out.println(String.format("%s je obiad", this.getName()));
			}
		}
	}
}
