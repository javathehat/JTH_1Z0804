package com.javathehat.threads4.deadlock;

/**
 * @author kontakt@javathehat.com
 */
public class Main {
	public static void main(String[] args) {
		String spoon = "lyzke";
		String plate = "talerz";
		
		Person husband = new Person(spoon,plate,"Maz");
		Person wife = new Person(plate,spoon,"Zona");
		
		husband.start();
		wife.start();
	}
}
