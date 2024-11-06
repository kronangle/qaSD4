package lab04;

import java.util.Scanner;

public class Lab04 {
	
	public int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextInt();
	}
	
	public void part1() {
		int bagPrice = getInt("“Price of a bag please?");
		
		if (bagPrice <= 0) {
			System.out.println("Sorry, the price must be greater than zero");
			return;
		}
		
		int moneyGot = getInt("How much money do you have?");
		
		if (moneyGot <= 0) {
			System.out.println("Sorry, the money must be greater than zero");
			return;
		}
		
		int numBag = 0;
				
		if (moneyGot > 0 && bagPrice > 0) {
			numBag = moneyGot / bagPrice;
		}
		
		System.out.printf("If the price is %dp\nand you have %dp\nthen you will be able to buy %d bags", bagPrice, moneyGot, numBag);
		
	}
}
