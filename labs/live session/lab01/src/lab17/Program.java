package lab17;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Duck("Clive"));
		animals.add(new Fish("Phillip"));
		animals.add(new Penguin("Henry", (Tools.getRandomInt(0, 1) == 1)));
		
		for (Animal animal : animals) {
			
			if (animal instanceof Consumable) {
				System.out.println(((Consumable)animal).describTaste());
				System.out.println(((Consumable)animal).isMainCourseDish());
			}
			
			if (animal instanceof Insurable) {
				System.out.println(((Insurable)animal).expires());
				System.out.println(((Insurable)animal).getPremium());
			}
			
			if (animal instanceof Penguin) {
				System.out.println("From the Northpole?: " + ((Penguin) animal).isNorthPole());
			}
		}
	}

}
