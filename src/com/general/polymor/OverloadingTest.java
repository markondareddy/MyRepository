package com.general.polymor;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11.0f, 11, 11));

	}

}

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, int b, int c) {
		return a + b + c;
	}
}