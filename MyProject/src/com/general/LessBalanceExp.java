package com.general;

public class LessBalanceExp extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	LessBalanceExp(){
		
	}
	LessBalanceExp(String err){
		//super(err);
      this.msg=err;
	}

}
