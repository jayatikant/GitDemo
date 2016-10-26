package com.skilrock.training.ocprinciple.good;


abstract class Shape {

	abstract void draw();
	
	public void print(){
	
		setUp();
		draw();
	}

	private void setUp() {
		//concrete implementation
		
	}
	
}

class Rectangle extends Shape {
	Rectangle() {
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
}

class Circle extends Shape {
	Circle() {
	
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
}