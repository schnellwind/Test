package de.fzi.test;

public class Singleton1 {
	
	private static Singleton1 instance = null;
	private Singleton2 s2;
	
	public static synchronized Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
			System.out.println("Create s1");
			instance.init();
			System.out.println("s1 init");
		}
		
		return instance;
			
		
	}
	
	
	private void init(){
		s2 = Singleton2.getInstance();
		System.out.println("get s2");
	}
	
	public void test(){
		System.out.println("s1 test");
		s2.test();
	}

}
