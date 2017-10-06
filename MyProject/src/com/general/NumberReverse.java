package com.general;

public class NumberReverse {

	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberReverse nr = new NumberReverse();
		int result = nr.reverseNumber(987654321);
		System.out.println("Result: " + result);

	}

}
