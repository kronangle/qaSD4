package lab13;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class Tools {

//	Gets an int form the console
	public static int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextInt();
	}
	
//	Gets a string form the console
	public static String getString(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextLine();
	}

//	Gets a double form the console
	public static double getDouble(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextDouble();
	}
	
//	Generates a random colour
	public static Color getRandomColor() {
		return new Color(getRandomInt(255), getRandomInt(255), getRandomInt(255));
	}
	
//	Generate a random number between zero and maxValue
	public static int getRandomInt(int maxValue) {
		Random random = new Random();
		return random.nextInt(maxValue) + 1;
	}
	
//  Generate a random number between min (inclusive) and max (exclusive)
	public static int getRandomInt(int min, int max) {
		Random random = new Random();
        return random.nextInt(max - min + 1) + min;
        
	}
}
