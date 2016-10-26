package com.skilrock.training.diprinciple.bad;

public class Application {
	public static void main(String[] args) {
		SomeService service = new SomeService();
		String userName = service.getUserName();
		System.out.println(userName);
	}
}
