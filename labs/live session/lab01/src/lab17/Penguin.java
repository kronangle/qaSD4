package lab17;

public class Penguin extends Bird {
	
	private boolean isNorthPole;

	/**
	 * @param animalType
	 * @param name
	 * @param isNorthPole
	 */
	Penguin(String name, boolean isNorthPole) {
		super(name);
		this.isNorthPole = isNorthPole;
	}

	boolean isNorthPole() {
		return isNorthPole;
	}
	
	
}
