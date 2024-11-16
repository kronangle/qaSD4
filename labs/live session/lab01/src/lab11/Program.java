package lab11;

import java.util.ArrayDeque;

public class Program {
	
	static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<>();
	

	
	
	public static void main(String[] args) {

//		buy();
//		processBaskets();
		
		Zoo zoo = new Zoo();
		
		zoo.addMoreAnimals();
		
	}

	private static void processBaskets() {
		for (ShoppingBasket basket : baskets) {
			basket.displayDetails();
			baskets.remove(basket);
			System.err.printf("%40s", "Basket processed!\n\n");
		}
	}

	private static void buy() {
		baskets.add(new ShoppingBasket("Bread", 2, 0.99));
		baskets.add(new ShoppingBasket("Milk", 1, 2.39));
		baskets.add(new ShoppingBasket("Cheese", 4, 4.50));
	}
	
	

}
