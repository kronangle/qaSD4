package lab17;

public class Duck extends Bird implements Insurable {

	Duck(String name) {
		super(name);
	}

	@Override
	public String expires() {
		return (getName() + " will expire in " + Tools.getRandomInt(10) + " days");
	}

	@Override
	public String getPremium() {
		return "The premium on " + getName() + " is quite high";
	}

}
