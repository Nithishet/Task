package com.cisco.Task;

public class Main {
	public static void main(String[] args) {
		Publisher publisher=new Publisher();
		Subscriber1 subscriber=new Subscriber1("Subscriber ");
		
		publisher.AddSubscriber(subscriber);
		publisher.Publish("hello subscribers");
		//publisher.RemoveSubscriber(subscriber);
		//publisher.Publish("subscriber removed");
	}

}
