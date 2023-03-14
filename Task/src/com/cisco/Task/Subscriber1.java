package com.cisco.Task;

public class Subscriber1 implements Subscriber {
	private String name;
	
	public Subscriber1(String name) {
		this.name=name;
	}

	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name +" received message : "+message);
	}

}
