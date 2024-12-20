package lab13;

import java.util.ArrayList;

public class Program {

	public static final int NUMBER_OF_CARS = 7;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running");

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		try {
			for (int i = 0; i < NUMBER_OF_CARS; i++) {
				vehicles.add(new Vehicle(0, i + 1));
			}
			for (Vehicle vehicle : vehicles) {
				System.out.println(vehicle.getDetails());
				
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.toString());
			System.err.println("Vehicles requested: " + NUMBER_OF_CARS + "\nVehicles created: " + vehicles.size());
		}
		

		

//		raceCars(vehicles);

	}

	private static void raceCars(ArrayList<Vehicle> vehicles) throws InterruptedException {
		int distanceTravelled = 0;

		while (distanceTravelled < 1000) {
			Thread.sleep(1000);
			
			System.out.println("========================================================================================");
//			Cycle through each vehicle
			for (Vehicle vehicle : vehicles) {
				
				int direction = Tools.getRandomInt(4);

				if (direction == 1) {
					vehicle.brake(Tools.getRandomInt(10));
				} else {
					vehicle.accelerate(Tools.getRandomInt(10));
				}

				System.out.println(vehicle.getDetails());
				distanceTravelled = vehicle.getDistanceTravelled(); // get distanceTravelled for current car

				if (distanceTravelled >= 1000) {
					System.out.printf("Lane %d is the winner\nHe reached 1000m first!\n", vehicle.getLane());
					break;
				}
			}
			System.out.println("========================================================================================");

		}
	}

}
