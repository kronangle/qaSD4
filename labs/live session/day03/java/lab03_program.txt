package lab03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Running");
		
		TheGoodStuff tgs = new TheGoodStuff();
		
		tgs.theLunchQueue();
		
		tgs.convertInputToStonesPounds(tgs.getInt("Please give me a weight in pounds?:  "));
		tgs.convertKgsToStonesPounds(tgs.getInt("Please give me a weight in kilograms?:  "));
	}

	

}
