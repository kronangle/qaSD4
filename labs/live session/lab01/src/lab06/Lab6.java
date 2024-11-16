package lab06;

import java.util.Iterator;
import java.util.Scanner;

public class Lab6 {

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

	public void part1() {
//		grades();
//		inAccount();
		multicationTable();
	}

	public void grades() {
		String[] names = new String[5];
		int mark;
		String[] marks = new String[5];

		for (int i = 0; i < 5; i++) {
			names[i] = getString("What is the student's name?: ");
			mark = getInt("What is the exam mark?: ");

			if ((1 < mark) && (mark < 100)) {

				if (mark < 50) {
					marks[i] = "Fail";
				} else if (mark >= 50 && mark <= 60) {
					marks[i] = "Pass";
				} else if (mark >= 61 && mark <= 70) {
					marks[i] = "Merit";
				} else {
					marks[i] = "Distinction";
				}

			} else {
				System.err.println("Error: marks must be between 1..10");
				break;
			}

		}

		for (int i = 0; i < 5; i++) {

			System.out.printf("The student, %s, received the grade: %s\n", names[i], marks[i]);
		}

	}
	
	public void inAccount() {
		double startMoney = getInt("How much money will you start with?: ");
		double currentMoney = startMoney;
		double rate = 1.05;
		int years = 0;
		
		while ( currentMoney <= (startMoney*2) ) {
			currentMoney = currentMoney * rate;
			years++;
		}
		
		System.out.println("It will take " + years + "years to double your money" );
		
	}
	
	public void multicationTable() {
		for (int i = 1 ; i <= 10 ; i++) {
			for (int j = 1 ; j <= 10 ; j++) {
				System.out.printf("%5d", i*j);
			}
			System.out.println();
		}
	}
	
	
}
