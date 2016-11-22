package com.javathehat.classdesign6.tostring;

public class ToStringExample {

	public static void main(String[] args){
		
		SUV car = new SUV();
		car.model = "MINI VAN";
		car.year = 1994;
		System.out.println(car.toString());
		
		Computer computer1 = new Laptop();
		Laptop computer2 = new Laptop();
		
		System.out.println(computer1);
		System.out.println(computer2);
		
	}
}


class Car {
	static int doors = 2;
	String model = "Porshe";
	int year = 2016;
	
	public String toString(){
		String result = "Car, model: " + model + ", production year: " + year + ", doors: " + doors;
		return result;
	}
}

class SUV extends Car{
	static int doors = 5;
}

class Computer {
	static boolean isLaptop = false;

	public String toString() {
		return "Laptop? " + isLaptop;
	}
}

class Laptop extends Computer{
	static boolean isLaptop = true;
}
