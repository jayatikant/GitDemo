package com.skilrock.training.lsprinciple.bad;


public class Square extends Rectangle{
	
	@Override
	public void setWidth(int width) {
		this.width = width;
		height = width;
	}

	@Override
	public void setHeight(int height) {
		this.width = height;
		this.height = height;
	}

}
