package lab12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Program2 {

	public static void main(String[] args) throws IOException {

		Gson gson = new Gson();
		String fileName = "C:\\lab01\\src\\customers.json";
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		Customer[] customers = gson.fromJson(content, Customer[].class);
//		System.out.println(customers[0].CustomerID);

		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].CustomerID);
		}

		gson = new Gson();
		int[] nos = { 1, 3, 5, 7, 9 };

		String res = gson.toJson(nos);
		System.out.println(res);

		String[] names = { "Bob", "Fred", "Wilma" };

		res = gson.toJson(names);
		System.out.println(res);

		Student[] students = { new Student("Bob", 21), new Student("Fred", 32), new Student("Wilma", 26) };

		res = gson.toJson(students);
		System.out.println(res);

		// -----------------------------------

	}

}
