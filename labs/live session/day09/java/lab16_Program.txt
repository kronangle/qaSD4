package lab16;

import lab16b.Car;
import lab16b.RacingCar;

public class Program {

	public static void main(String[] args) {

		Car[] cars = { new Car("Toyota", 0), new Car("Honda", 0), new RacingCar("Ferrari", 0, "Alex", 2),
				new RacingCar("Mercedez", 0, "Dave", 3), };

		processCars(cars);

	}

	private static void processCars(Car[] cars) {

		for (Car car : cars) {
//			Cars starting boost
			if (car instanceof Car)
				if (car.getSpeed() == 0)
					car.getToSixty();
			
			car.accelerate(2);
			System.out.printf("Model: %s\nSpeed: %d\n",car.getModel() ,car.getSpeed() );
			
			if (car instanceof RacingCar)
				System.out.printf("Driver: %s\nTurboFactor: %d\n",((RacingCar)car).getDriver(),((RacingCar)car).getTurboFactor());
			
			
			
		}

	}

}
