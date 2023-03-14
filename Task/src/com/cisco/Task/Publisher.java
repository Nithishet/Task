package com.cisco.Task;

import java.util.ArrayList;

public class Publisher {
	private ArrayList<Subscriber> subscriber=new ArrayList<Subscriber>();
	
	public void AddSubscriber(Subscriber subscriber) {
		this.subscriber.add(subscriber);
	}

	public void Publish(String message) {
		for(Subscriber sub:subscriber) {
			sub.update(message);
		}
	}

}
