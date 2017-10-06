package com.general;

public class DecimalToBinary {

	public int[] printBinaryFormat(int n) {
		int binary[] = new int[5];
		int index = 0;
		while (n > 0) {
			binary[index++] = n % 2;
			n = n / 2;

		}
		return binary;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToBinary dtb = new DecimalToBinary();
		int[] result=dtb.printBinaryFormat(5);
//		System.out.println(result);
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}

}
