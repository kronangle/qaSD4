package lab08;

import java.util.Scanner;

public class Utils {

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

	public double getDouble(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextDouble();
	}

}
