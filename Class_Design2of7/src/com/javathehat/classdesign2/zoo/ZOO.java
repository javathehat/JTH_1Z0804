package com.javathehat.classdesign2.zoo;
/**
 * @author kontakt@javathehat.com
 */
public class ZOO {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		
		animals[0] = new Monkey();
		animals[1] = new Lion();
		animals[2] = new Lion();
		animals[3] = new Lion();
		animals[4] = new Lion();
		animals[5] = new Monkey();
		animals[6] = new Monkey();
		animals[7] = new Monkey();
		animals[8] = new Monkey();
		animals[9] = new Monkey();
		
		for(Animal animal : animals){
			animal.eat();
		}
		
//		Animal monkey1 = new Monkey();
//		Monkey monkey2 = new Monkey();
//		
//		monkey1.sleep();
//		monkey2.sleep();
		
	}

}
