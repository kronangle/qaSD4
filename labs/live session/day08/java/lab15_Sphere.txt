package lab15;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {

	/**
	 * @param colour
	 * @param position
	 * @param radius
	 */
	public Sphere(Color colour, Point position, int radius) {
		super(colour, position, radius);
	}

	public double getVolume() {
		return (4 / 3) * (Math.PI) * (Math.pow(radius, 3));
	}

	public String printCharacteristics() {
		String stats = String.format("Colour = %s\nPosition = %.1f,%.1f\nRadius = %d\nVolume of Sphere = %.2f\n",
				getColour(), getPosition().getX(), getPosition().getY(), getRadius(), getVolume());
		return stats;
	}

}
