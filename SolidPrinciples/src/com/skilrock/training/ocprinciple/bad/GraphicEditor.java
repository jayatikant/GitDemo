package com.skilrock.training.ocprinciple.bad;

public class GraphicEditor {
	public void drawShape(Shape shape) {
		if (shape.shapeType == 1)
			drawRectangle(shape);
		else if (shape.shapeType == 2)
			drawCircle(shape);
	}

	public void drawCircle(Shape s) {
		// some implementation
	}

	public void drawRectangle(Shape s) {
		// some other implementation
	}
}

class Shape {
	int shapeType;

}

class Rectangle extends Shape {
	Rectangle() {
		super.shapeType = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.shapeType = 2;
	}
}