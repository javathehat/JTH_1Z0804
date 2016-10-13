package com.javathehat.threads4.producerconsumer;

import java.util.List;

/**
 * @author kontakt@javathehat.com
 */
public class Producer extends Thread{
	private List<String> warehouse;
	private Consumer consumer;
	
	public Producer(List<String> warehouse){
		this.warehouse = warehouse;
	}
	
	public void setConsumer(Consumer consumer){
		this.consumer=consumer;
	}
	
	public void run(){
		while(true){
			if(warehouse.isEmpty()){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				warehouse.add("item");
				System.out.println("producing item");
			}else{
				synchronized(consumer){
					consumer.notify();
				}
				synchronized(this){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
