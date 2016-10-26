package com.skilrock.training.diprinciple.good;

public class SomeService {
	
	Repository repository;
	
	public SomeService(Repository repository) {
		this.repository  = repository;
	}

	public String getUserName(){
		return repository.getUserName(1);
	}
}
