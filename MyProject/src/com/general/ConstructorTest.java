package com.general;

public class ConstructorTest {
	String name;
	int age;

	ConstructorTest() {
		System.out.println("This is default constructor");
	}

	/*ConstructorTest(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("parameter constructor");
	}
*/
	{
		System.out.println("This is block");
	}
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Before creating object");

//		new ConstructorTest("test", 100);
		new ConstructorTest();

		System.out.println("after creating object");

	}

}
