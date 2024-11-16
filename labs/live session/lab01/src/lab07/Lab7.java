package lab07;

public class Lab7 {

	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };

		for (int number : numbers) {
			System.out.printf("%5d", number);
		}
		System.out.println();
		System.out.println("Sum of = " + findSum(numbers));
		System.out.println("Average of = " + findAverage(numbers));
		System.out.println("Lowest number = " + findLowest(numbers));
		System.out.println("Highest number = " + findHighest(numbers));
		System.out.println("Zero is located at index [" + findIndexOfZero(numbers) + "]");

		numbers = sort(numbers);
		for (int number : numbers) {
			System.out.printf("%5d", number);
		}
		System.out.println();
		System.out.println("Zero is located at index [" + findIndexOfZero(numbers) + "]");
	}

	private int findIndexOfZero(int[] numbers) {
		int index = 0;

		for (int number : numbers) {
			if (number == 0) {
				break;
			}
			index++;
		}

		return index;
	}

	private int findHighest(int[] numbers) {
		int highest = 0;

		for (int number : numbers) {

			if (number > highest) {
				highest = number;
			}

		}

		return highest;

	}

	private int findLowest(int[] numbers) {
		int lowest = 0;

		for (int number : numbers) {

			if (number < lowest) {
				lowest = number;
			}

		}

		return lowest;

	}

	private double findAverage(int[] numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		return sum / numbers.length;

	}

	private int findSum(int[] numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		return sum;
	}

	public int[] sort(int[] numbers) {
		int nextNumber = 0;
		boolean swapMade = true;

		while (swapMade) {
			int swapCount = 0;

			for (int i = 0; i < numbers.length - 1; i++) {
//				Set up
				int placeholder = 0;
				nextNumber = numbers[i + 1];
//				Check number
				if (numbers[i] > nextNumber) {
					placeholder = numbers[i];
					numbers[i] = nextNumber;
					numbers[i + 1] = placeholder;
					for (int number : numbers) {
						System.out.printf("%5d", number);
					}
					System.out.println();
					swapCount++;
					break;
				}

			}
			swapMade = (swapCount > 0);
		}

		return numbers;

	}

}
