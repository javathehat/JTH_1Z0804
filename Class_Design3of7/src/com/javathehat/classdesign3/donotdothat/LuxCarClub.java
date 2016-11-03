package com.javathehat.classdesign3.donotdothat;


public class LuxCarClub {
	public void addMember(Ferrari ferrari){};
	public void addMember(Lamburgini lamburgini){};
	
	public static void main(String[] args){
		LuxCarClub club = new LuxCarClub();
		
		Ferrari ferrari1 = new Ferrari();
		Car ferrari2 = new Ferrari();
		club.addMember(ferrari1);
//		club.addMember(ferrari2);//nie skompiluje się
	}

}

class Car{}
class Ferrari extends Car{
	
	public Ferrari(){
		super();
//		this("testarossa");//nie skompiluje sie
	}
	public Ferrari(String model){
		this();
//		this("testarossa","red");//nie skompiluje się
		
	}
	private Ferrari(String model, String color){
		this("testarossa");
	}
}
class Lamburgini extends Car{}
