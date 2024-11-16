package lab16b;

public class RacingCar extends Car{
		
	private String driver;
	private int turboFactor;
	/**
	 * @param model
	 * @param speed
	 * @param driver
	 * @param turboFactor
	 */
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
		
		
		
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds*turboFactor);
	}
	
	@Override
	public String getModel() {
		return "Race " + super.getModel();
	}
	
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getTurboFactor() {
		return turboFactor;
	}
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	
}
