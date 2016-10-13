package com.javathehat.threads4;

public class PossibleSource {
	public static int globalCounter = 0; //Zasob wrazliwy w aplikacji wielowatkowej
	private int localCounter = 0; //Zasob wrazliwy w aplikacji wielowatkowej
	public String name = "Name"; //String jest obiektem final, nie szkodzi mu wielowatkowosc
	public static final int VALUE = 101; //Zadeklarowalismy int jako final, nie szkodzi mu wielowatkowosc

	public void addToLocalCounter(int value){
		this.localCounter += value;
	}
	
	public int calculate(int value){
		int result = value * localCounter;
		return result; //Zmienna result widoczne jest tylko w obrebie jednego watku, nie szkodzi jej wielowatkowosc
	}
	
	public void doSomething() throws Exception{
		throw new Exception("funny exception");//Exception jest final, nie grozi mu wielowotkowosc
	}
}
