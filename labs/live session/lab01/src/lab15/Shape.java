package lab15;

import java.awt.Color;
import java.awt.Point;

public abstract class Shape {
	
	Color colour;
	Point position;
	
	
	
	/**
	 * @param colour
	 * @param position (x, y)
	 */
	public Shape(Color colour, Point position) {
		this.colour = colour;
		this.position = position;
		
		
	}

	public Color getColour() {
		return colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public Point getPosition() {
		return position;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}
	
	
}
