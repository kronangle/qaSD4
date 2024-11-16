package lab16b;

public class Car {
	
	private String model;
	private int speed;
	/**
	 * @param model
	 * @param speed
	 */
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void getToSixty() {
		speed = 60;
	}
	
	public void accelerate (int seconds) {
		speed += (5*seconds);
	}
	
	
	public String getModel() {
		
		return  model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
