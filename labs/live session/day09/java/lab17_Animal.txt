package lab17;

public abstract class Animal {
	
	AnimalType animalType;

	/**
	 * @param animalType
	 */
	Animal(AnimalType animalType) {
		super();
		this.animalType = animalType;
	}

	AnimalType getAnimalType() {
		return animalType;
	}

	void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}
	
	
}
