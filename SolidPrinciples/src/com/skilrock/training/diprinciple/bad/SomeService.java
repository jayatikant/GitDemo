package com.skilrock.training.diprinciple.bad;

public class SomeService {
	

	public String getUserName(){
		return new SomeRepository().getUserName(1);
	}
}
