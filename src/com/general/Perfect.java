package com.general;

import java.util.Scanner;

public class Perfect {
	/*
	 * public static void perfect(int x) { int sum = 0; for (int i = 1; i < x;
	 * i++) { if (x % i == 0) { sum += i; } }
	 * 
	 * if (sum == x) System.out.println("Given number is perfect"); else
	 * System.out.println("Not a perfect number");
	 * 
	 * }
	 */

	public static void febinocci(int y) {
		int feb[] = new int[y];
		feb[0] = 0;
		feb[1] = 1;
		System.out.println(feb[0]);
		System.out.println(feb[1]);
		for (int i = 2; i < y; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
			System.out.println(feb[i]);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("X value:" + x);
		// Perfect.perfect(x);// perfect number
		Perfect.febinocci(x);// fibonacci series

	}

}
