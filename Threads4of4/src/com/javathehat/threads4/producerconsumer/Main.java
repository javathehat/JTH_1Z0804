package com.javathehat.threads4.producerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kontakt@javathehat.com
 */
public class Main {
	public static void main(String[] args) {

		List<String> warehouse = new ArrayList<String>();
		Producer producer = new Producer(warehouse);
		Consumer consumer = new Consumer(warehouse);
		producer.setConsumer(consumer);
		consumer.setProducer(producer);
		
		producer.start();
		consumer.start();
	}
}
