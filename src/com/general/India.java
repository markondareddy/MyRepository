package com.general;

public class India implements Currency {

	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return "Rupee";
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "Rs";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		India india = new India();
		System.out.println(india.getCurrency());
		System.out.println(india.getSymbol());

	}

}
