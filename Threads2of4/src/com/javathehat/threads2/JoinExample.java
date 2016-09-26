package com.javathehat.threads2;

/**
 * @author javathehat.com
 */
public class JoinExample extends Thread{
	
	private String msg;
	private Thread toJoin;
	
	public static void main(String[] args){
		
		JoinExample toJoinThread = new JoinExample("Ja zawsze jestem pierwszy");
		JoinExample joiningThread = new JoinExample("A ja muszę czekać aż on skonczy :( ", toJoinThread);
		
		joiningThread.start();
		toJoinThread.start();
		
	}
	
	public JoinExample(String msg){
		this.msg = msg;
	}
	
	public JoinExample(String msg, Thread toJoin){
		this.msg = msg;
		this.toJoin = toJoin;
	}
	
	public void run(){
		
		if(toJoin != null){
			
			try {
				//Czekamy aż wątek toJoin się zakończy
				toJoin.join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(msg);
	}

}
