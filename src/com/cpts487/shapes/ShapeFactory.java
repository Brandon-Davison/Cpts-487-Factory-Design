package com.cpts487.shapes;

public class ShapeFactory {
	
	/**
	 * The factory method creating our Shapes
	 * 
	 * @param shape shapes type
	 * @param style shapes style
	 * @return New derived Shape instance
	 */
	public static Shape createShape(String shape, Style style) {
		if (shape == null) return null;
		
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle(style);
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle(style);
		}
		
		return null;
	}

}
