package com.cpts487.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	private List<Shape> activeShapes = new ArrayList<>();
	
	public Canvas() {
		Shape circle = ShapeFactory.createShape("circle", new Style(0, 0, 0));
		// Draw the circle onto our canvas window here
		
		// Add the shape onto our list of active shapes (could hash it later by adding UUID for user editing)
		activeShapes.add(circle);
	}

}
