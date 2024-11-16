package lab17;

public abstract class Bird extends Animal implements Consumable {
	
	private String name;
	
	

	/**
	 * @param animalType
	 * @param name
	 */
	Bird(AnimalType animalType, String name) {
		super(animalType);
		this.name = name;
	}
	
	Bird(String name) {
		this(AnimalType.BIRD, name);
	}

	@Override
	public String describTaste() {
		return getName() + ": " + "Delicious";

	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}

	String getName() {
		return name;
	}


}
