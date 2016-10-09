package com.javathehat.threads3.synchronize.shop;

/**
 * @author javathehat.com
 */
public class Owner extends Thread{

	private WaterCloset wc;
	
	public Owner(WaterCloset wc){
		
		this.wc = wc;
	}
	
	public void run(){
		
		for(int i = 0; i < 15; i++){
			System.out.println(String.format("--> FLUSH COUNTER: %d", wc.getFlushCounter()));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
