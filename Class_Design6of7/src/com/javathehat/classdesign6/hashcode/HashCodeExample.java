package com.javathehat.classdesign6.hashcode;

import java.util.HashMap;

public class HashCodeExample {
	
	public static void main(String[] args){
		
		Card c1 = new Card();
		c1.value = 10;
		
		HashMap<Card, String> map = new HashMap<Card, String>();
		map.put(c1, "karata c1");
		
		System.out.println(map.get(c1));

	
	}

}

class Card{
	int value;
	
	public boolean equals(Object obj){
		if(obj.getClass().equals(this.getClass())){
			Card other = (Card) obj;
			return this.value == other.value;
		}
		
		return false;
	}
	
	public int hashCode(){
		return Integer.valueOf((int) (Math.random() * 500));
	}
}