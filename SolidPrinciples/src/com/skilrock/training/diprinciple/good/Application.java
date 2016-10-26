package com.skilrock.training.diprinciple.good;

public class Application {

	public static void main(String[] args) {

		SomeService service = new SomeService(
				RepositoryFactory.getInstance("some"));
		System.out.println(service.getUserName());

		service = new SomeService(RepositoryFactory.getInstance("another"));
		System.out.println(service.getUserName());
		
	}

}
