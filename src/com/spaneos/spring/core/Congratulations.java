package com.spaneos.spring.core;

public class Congratulations implements Greetings {

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void printGreetings() {
		System.out.println(message);
		
	}

}
