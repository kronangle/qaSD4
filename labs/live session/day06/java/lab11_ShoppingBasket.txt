package lab11;

public class ShoppingBasket {

	private String productName;
	private int quantity;
	private double price;
	
	
	public ShoppingBasket(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.printf("Shopping Basket: \n%30s|%5d|%10.2f\n", productName, quantity, price);
	}
	
}
