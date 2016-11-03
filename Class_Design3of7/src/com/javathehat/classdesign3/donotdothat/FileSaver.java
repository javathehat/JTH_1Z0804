package com.javathehat.classdesign3.donotdothat;

import java.io.File;

/**
 * @author kontakt@javathehat.com
 */
public class FileSaver {
	
	public static void save(Object1 obj){
		//preparing object1
		//saving:
		save(obj, "/obj/obj1.csv");
	}
	
	public static void save(Object2 obj){
		//preparing object2 - step 1
		//preparing object1 - step 2
		//saving:
		save(obj, "/obj/data/obj2.txt");
	}
	
	private static void save(Object obj, String path){
		//saving object into given path
	}
	
	public void load(String file){};
	public void load(String file,String encoding){};
	public void load(String file,String encoding,String locale){};
	
	public void update(String file, String locale){};
//	public void update(String locale, String file){};// nie skompiluje się
	public void update(File file, String locale){};

	public void copy(File file1, String file2){};
	public void copy(String file1, File file2){};
	public void copy(String file2, String file1){};
//	public void copy(String file1, String file2){};//nie skompiluje sie
	
}
