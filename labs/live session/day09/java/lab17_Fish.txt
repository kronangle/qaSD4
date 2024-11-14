package lab17;

public class Fish extends Animal implements Insurable, Consumable {
	
	private String name;
	
	

	/**
	 * @param animalType
	 * @param name
	 */
	Fish(String name) {
		super(AnimalType.FISH);
		this.name = name;
	}

	@Override
	public String describTaste() {
		return getName() + ": " + "Delicious";

	}

	@Override
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}

	@Override
	public String expires() {
		return (getName() + " will expire in " + Tools.getRandomInt(10) + " days");
	}

	@Override
	public String getPremium() {
		// TODO Auto-generated method stub
		return null;
	}

	String getName() {
		return name;
	}

	
	
}
