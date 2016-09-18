package com.javathehat.threads1;

/**
 * 
 * @author javathehat.com
 *
 */
public class Driver extends Thread{
	
	private final int laps = 3;
	private String name;
	
	public Driver(String name){
		this.name = name;
	}
	
	public void run(){
		race();
	}
	
	private void race(){
		
		for(int i = 1 ; i <= laps; i++){
			System.out.println(String.format("Kierowca: %s, okrozenie: %d", name,i));
		}
		
		System.out.println(String.format("%s ukonczyl wyscig!", name));
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Kierowcy na start!");
		
		Driver d1 = new Driver("Waldemar");
		Driver d2 = new Driver("Henryk");
		Driver d3 = new Driver("Ksawery");
		
		System.out.println("START!");
		
		d1.start();
		d2.start();
		d3.start();

	}

}
