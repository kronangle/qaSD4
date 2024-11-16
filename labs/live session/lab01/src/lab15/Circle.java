package lab15;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {

	int radius;

	/**
	 * @param colour
	 * @param position
	 * @param radius
	 */
	public Circle(Color colour, Point position, int radius) {
		super(colour, position);
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI) * (Math.pow(radius, 2));
	}

	public double getCircumference() {
		return 2 * (Math.PI) * radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public String printCharacteristics() {
		String stats = String.format(
				"Colour = %s\nPosition = %.1f,%.1f\nRadius = %d\nArea = %.2f\nCircumference = %.2f\nDiameter = %.2f\n",
				getColour(), getPosition().getX(), getPosition().getY(), radius, getArea(), getCircumference(), getDiameter());
		return stats;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

}
