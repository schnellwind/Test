package de.fzi.test;

public class Singleton2 {
	
	private static Singleton2 instance = null;
	
	private Singleton1 s1;
	
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
			System.out.println("create s2");
		}
		
		return instance;
			
		
	}
	
	
	private Singleton2(){
		s1 = Singleton1.getInstance();
		System.out.println("get s1");
	}
	
	/**
	 * 
	 */
	public void test(){
		System.out.println("s2 test");
		
	}
	
	public void test2(){
		System.out.println("s2 test");
		
	}

}
