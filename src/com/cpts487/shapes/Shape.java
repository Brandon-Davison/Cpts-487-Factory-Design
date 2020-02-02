package com.cpts487.shapes;

public abstract class Shape {
	
	private Style style;

	public Shape(Style style) {
		this.style = style;
	}
	
	public abstract void draw();

}
