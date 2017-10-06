package com.general;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, i, k, j;
		for (i = 1; i < 10; i++) {
			k = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum = " + sum);

	}

}
