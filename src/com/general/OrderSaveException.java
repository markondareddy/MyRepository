package com.general;

public class OrderSaveException extends Exception {
	private static final long serialVersionUID = 1L;

	String name;
	public OrderSaveException() {
	}

	public OrderSaveException(String msg) {
		super(msg);
	}

}
