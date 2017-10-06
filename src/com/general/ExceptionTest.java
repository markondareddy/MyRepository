package com.general;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionTest.myTest("markonda");
		} catch (MyAppException mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		} finally {
			System.out.println("finally block");
		}
	}

	static void myTest(String str) throws MyAppException {
		if (str == null) {
			throw new MyAppException("String is null");
		}
	}

}
