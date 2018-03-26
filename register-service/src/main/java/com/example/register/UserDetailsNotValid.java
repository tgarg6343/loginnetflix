package com.example.register;

public class UserDetailsNotValid extends RuntimeException {

	public UserDetailsNotValid(String msg) {
		super(msg);
	}

	public Object getBindingResult() {
		// TODO Auto-generated method stub
		return null;
	}


}
