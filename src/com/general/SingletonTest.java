package com.general;

public class SingletonTest {

	private static SingletonTest obj;

	private SingletonTest() {

	}

	public static SingletonTest getInstance() {
		if (obj == null) {
			obj = new SingletonTest();
		}
		return obj;
	}
	
	public void getSomething(){
		System.out.println("I am here");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonTest st=SingletonTest.getInstance();
		st.getSomething();
		

	}

}
