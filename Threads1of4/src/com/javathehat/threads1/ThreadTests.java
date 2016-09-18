package com.javathehat.threads1;

import com.javathehat.threads1.thread.SampleBadThread;
import com.javathehat.threads1.thread.SampleThread;

/**
 * 
 * @author javathehat.com
 *
 */
public class ThreadTests {
	
	public static void main(String[] args) {
		
		ThreadTests tt = new ThreadTests();
		//Odkomentuj dowolna linie, aby przetestowac przyklad:
//		tt.test01();
//		tt.test02();
//		tt.test03();
	}
	
	public void test01(){
		SampleThread thread1 = new SampleThread();
		thread1.run(); //Nie tworzy nowego wątku
		
		SampleThread thread2 = new SampleThread();
		thread2.run(); //Nie tworzy nowego wątku
	}
	
	public void test02(){
		
		SampleBadThread sampleBadThread = new SampleBadThread();
		sampleBadThread.start();
	}
	
	public void test03(){
		
		SampleThread sampleThread = new SampleThread();
		Thread thread = new Thread(sampleThread);
		
		thread.start();
		//tylko metoda run() z klasy SampleThread zostanie wywolana
	}

}


