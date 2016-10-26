package com.skilrock.training.diprinciple.good;

public class RepositoryFactory {

	public static Repository getInstance(String repositoryName) {

		if (repositoryName.equals("some")) {
			return new SomeRepository();
		}
		if (repositoryName.equals("another")) {
			return new AnotherRepository();
		}

		throw new IllegalArgumentException("unknown repository");
	}
}
