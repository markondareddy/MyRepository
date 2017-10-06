package com.general;

public class WrapperTest {

	public int getMessage(String str) throws NullPointerException {
		if (str == null) {
			throw new NullPointerException("String input is null");
		}
		return str.length();
	}

	public static void main(String[] args) {

		try {
			WrapperTest wt = new WrapperTest();

			System.out.println(wt.getMessage("markonda"));
			System.out.println(wt.getMessage(null));
		} catch (NullPointerException n) {
			System.out.println(n.getMessage());;
		}

	}
}
