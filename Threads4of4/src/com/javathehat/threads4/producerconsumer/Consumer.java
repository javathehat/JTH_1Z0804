package com.javathehat.threads4.producerconsumer;

import java.util.List;

/**
 * @author kontakt@javathehat.com
 */
public class Consumer extends Thread {
	private List<String> warehouse;
	private Producer producer;
	
	public Consumer(List<String> warehouse){
		this.warehouse = warehouse;
	}
	public void setProducer(Producer producer){
		this.producer = producer;
	}
	
	public void run(){
		while(true){
			if(!warehouse.isEmpty()){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				warehouse.remove(0);
				System.out.println("consuming item");
			}else{
				synchronized(producer){
					producer.notify();
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
