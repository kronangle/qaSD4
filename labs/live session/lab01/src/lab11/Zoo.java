package lab11;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

//	Declarations
	HashMap<String, Integer> animalMap = null;
	String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };
	String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

//	Constructor
	public Zoo() {
		animalMap = new HashMap<>();

		addAnimals(originalAnimals);
		addAnimals(newAnimals);

		displayAnimalData();

	}

	public void addAnimals(String[] animals) {
		int count;

		for (String animal : animals) {
			count = 1;
			if (animalMap.containsKey(animal)) {
				count += animalMap.get(animal);
				animalMap.put(animal, count);
			} else {
				animalMap.put(animal, count);
			}
		}
	}

	public void addAnimals(HashMap<String, Integer> additionalAnimals) {
		
		for (String animal : additionalAnimals.keySet()) {
			animalMap.merge(animal, additionalAnimals.get(animal), Integer::sum);
		}
		

//		for (String animal : additionalAnimals.keySet()) {
//			if (animalMap.containsKey(animal)) {
//				animalMap.put(animal, (animalMap.get(animal) + additionalAnimals.get(animal)));
//			} else {
//				animalMap.put(animal, additionalAnimals.get(animal));
//			}
//		}
	}

	public void displayAnimalData() {
		for (String animal : animalMap.keySet()) {
			System.out.printf("%-10s | %5d\n", animal, animalMap.get(animal));
		}
	}

	public void addMoreAnimals() {

		HashMap<String, Integer> additionalAnimals = new HashMap<>();

		for (;;) {
			String ans = Tools.getString("\nWould you like to add more animals? \n ( y / n )");

			if (ans.toLowerCase().startsWith("y")) {
				additionalAnimals.put(Tools.getString("Please enter the animal to add?"),
						Tools.getInt("How many would you like to add?"));
			} else {
				addAnimals(additionalAnimals);
				displayAnimalData();
				break;
			}
		}

	}

}
