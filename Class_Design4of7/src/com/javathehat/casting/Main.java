package com.javathehat.casting;

import java.nio.channels.ShutdownChannelGroupException;

/**
 * @author kontakt@javathehat.com
 */
public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Ferrari();
//		showOf(vehicle); //nie skompiluje się
		
//		vehicle.showOfWithFerrari(); //nie skompiluje sie
		((Ferrari) vehicle).showOfWithFerrari();
//		(Ferrari) vehicle.showOfWithFerrari();// nie skompiluje sie
		
		Ferrari ferrari = (Ferrari) vehicle;
		showOf(ferrari);
		
		Car normalCar = new Car();
		MilitaryVehicle militaryVehicle = (MilitaryVehicle) normalCar;//rzuci wyjątkiem przy uruchomieniu
		MilitaryVehicle pickup = new MilitaryPickup();
		
		vehicle = (Ferrari) null;
		
		
		vehicle = new Car();
		if(vehicle instanceof Ferrari){
			System.out.println("Fajne Ferrari!");
		}
		
		MilitaryVehicle pickup2 = new MilitaryPickup();
//		if(pickup2 instanceof Integer){  //nei skompiluje się
//			System.out.println("to cud!");
//		}
		
		

	}
	
	public static void showOf(Ferrari ferrari){
		System.out.println("Look at my car loosers!!!");
	}

}

interface Vehicle {}
class Car implements Vehicle {}
class Ferrari extends Car {
	public void showOfWithFerrari(){
		System.out.println("Look at my awfuly expensive Ferrari!");
	}
}
interface MilitaryVehicle {}
class MilitaryPickup extends Car implements MilitaryVehicle{}
