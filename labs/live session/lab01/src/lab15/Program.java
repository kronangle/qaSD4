package lab15;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(Color.RED, new Point(5, 5), 3, 5);
		Circle circ1 = new Circle(Color.black, new Point(10, 10), 7);
		Sphere sphe1 = new Sphere(Color.green, new Point(15, 15), 3);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(rect1);
		shapes.add(circ1);
		shapes.add(sphe1);

		for (Shape shape : shapes) {
			System.out.printf("Colour = %s\nPosition = %.1f,%.1f\n", shape.getColour(), shape.getPosition().getX(),
					shape.getPosition().getY());
		}

		System.out.println("=====================================================");
		System.out.println(rect1.printCharacteristics());
		System.out.println("=====================================================");
		System.out.println(circ1.printCharacteristics());
		System.out.println("=====================================================");
		System.out.println(sphe1.printCharacteristics());
		System.out.println("=====================================================");

	}

}
