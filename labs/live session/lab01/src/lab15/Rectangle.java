package lab15;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape {

	int sideA;
	int sideB;

	/**
	 * @param colour
	 * @param position
	 * @param sideA
	 * @param sideB
	 */
	public Rectangle(Color colour, Point position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public int getArea() {
		return sideA * sideB;
	}

	public String printCharacteristics() {
		String stats = String.format(
				"Colour = %s\nPosition = %.1f,%.1f\nSideA = %d\nSideB = %d\nArea = %d\nCircumference = %d\n",
				getColour(), getPosition().getX(), getPosition().getY(), sideA, sideB, getArea(), getCircumference());
		return stats;
	}

	public int getCircumference() {
		return (sideA + sideB) * 2;
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

}
