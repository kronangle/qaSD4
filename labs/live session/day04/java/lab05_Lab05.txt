package lab05;

import java.util.Scanner;

public class Lab05 {
	
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
	

	public void grades() {
		int mark = getInt("What is the exam mark?: ");
		
		if ((1 < mark) && (mark < 100)) {
			
			if (mark < 50) {
				System.out.println("Fail");
			} else if (mark >= 50 && mark <= 60) {
				System.out.println("Pass");
			} else if (mark >= 61 && mark <= 70) {
				System.out.println("Merit");
			} else {
				System.out.println("Distinction");
			}
			
		} else {
			System.err.println("Error: marks must be between 1..10");
		}
	}
	
	public void part2() {
		String ans = getString("""
				\nIs it summer time?
				( y / n )
				
				""").toLowerCase();
		
		boolean isSummer = ans.equals("y");
		
		ans = getString("""
				\nIs it early evening time?
				( y / n )
				
				""").toLowerCase();
		
		boolean isEvening = ans.equals("y");
		
		if (isSummer && isEvening) {
			System.out.println("You should:");
			System.out.println("Take a shower");
			System.out.println("Eat outside");
			System.out.println("Do outdoors hobby");
			System.out.println("Contact friends");
			
		} else if (!isSummer && !isEvening) {
			System.out.println("You should:");
			System.out.println("Take a shower");
			System.out.println("Eat inside");
			System.out.println("Contact friends");

		} else if (isSummer) {
			System.out.println("You should:");
			System.out.println("Take a shower");
			System.out.println("Eat inside");
			System.out.println("Do outdoors hobby");
			System.out.println("Contact friends");

		} else if (isEvening) {
			System.out.println("You should:");
			System.out.println("Take a shower");
			System.out.println("Eat inside");
			System.out.println("Take a walk");
			System.out.println("Contact friends");


		} else {
			System.err.println("Oops, I didn't meet any conditions");
		}
		
	}
}
