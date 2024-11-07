package lab07;

public class Program {

	public static void main(String[] args) {
		
		Lab7 lab7 = new Lab7();
		long startTime = System.currentTimeMillis();

		lab7.start();

		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;

		System.out.println("Execution time: " + executionTime + " milliseconds");
		
	}

}
