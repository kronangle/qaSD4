package lab18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {

	private static final int NUM_OF_PEOPLE = 6;
	private static int[] ages = { 36, 53, 51, 21, 41, 19 };
	private static String[] names = { "Holland", "Turner", "Powell", "Vicious", "Lyndon", "Spears" };

	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<Person>();

		for (int i = 0; i < NUM_OF_PEOPLE; i++) {
			people.add(new Person(names[i], ages[i]));
		}
		
		System.out.println("Original");
		people.stream().forEach(System.out::println);

		System.out.println("===================");
		System.out.println("By Age");
		people.stream().sorted((p1, p2) -> (p1.age - p2.age)).forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println("By Name");
		people.stream().sorted((p1, p2) -> (p1.name.compareTo(p2.name))).forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println("By Name Length");
		people.stream().sorted((p1, p2) -> (p1.name.length() - p2.name.length())).forEach(System.out::println);
		
		System.out.println("===================");
		System.out.println("Filter Age > 30");
		people.stream().filter(s -> s.age > 30).sorted().forEach(System.out::println);
		
	}

}
