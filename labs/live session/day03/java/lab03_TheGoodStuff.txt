package lab03;

import java.util.Scanner;

public class TheGoodStuff {
	
	public int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextInt();
	}

	public String getString(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextLine();
	}

	public void theLunchQueue() {
		String dish = getString("What main dish would you like(Fish, Burgers or veg)?: ");
		int potatos = getInt("How many roast potatoes would you like?: ");
		int sprouts = getInt("How many Brussel Sprouts would you like?: ");

		System.out.printf(
				"Thank you for your order. \nThe %s with %d roasted potatoes and %d brussel sprouts is a fine choice!\n",
				dish, potatos, sprouts);
	}

	public void convertInputToStonesPounds(int pounds) {
		System.out.println("Starting weight: " + pounds + "lbs");

		int stones = pounds / 14;
		int remainder = pounds % 14;

		System.out.printf("New weight: %d stones %d pounds\n", stones, remainder);
	}

	public void convertKgsToStonesPounds(int kg) {
		System.out.println("Starting weight: " + kg + "kg");

		double pounds = kg * 2.20462;
		double stones = pounds / 14;
		double remainder = pounds % 14;

		int poundsI = (int) (kg * 2.20462);
		
		System.out.println("Integer conversion:");
		convertInputToStonesPounds(poundsI);

		System.out.println("Double conversion:");
		System.out.println("New weight: " + stones + " stones " + remainder + "pounds");

	}
}
