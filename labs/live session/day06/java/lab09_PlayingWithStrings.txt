package lab09;

public class PlayingWithStrings {

	public static void main(String[] args) {
//		------------------------------------------------------------------------------------------
		String name = "Alexander";
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		for (char c : name.toCharArray()) {
			System.out.println(c);
		}
		
		if (name.toUpperCase().startsWith("DER")) {
			System.out.println("Name starts with \"DER\"");
		} else {
			System.out.println("Name does not start with \"DER\"");
		}

		
		if  (name.toUpperCase().endsWith("DER")) {
			System.out.println(" Name ends with \"DER\"");
		} else {
			System.out.println(" Name does not end with \"DER\"");
		}
		
		
		int index = name.toLowerCase().indexOf('e');
			
		if (index >= 0)
			System.out.printf("The letter 'e' is found first at position: %d\n", index);
		else 
			System.out.println("Cannot find the letter 'e'.");
		
		index = name.toLowerCase().indexOf('y');
		
		if (index >= 0)
			System.out.printf("The letter ye' is found first at position: %d\n", index);
		else 
			System.out.println("Cannot find the letter ye'.");
		
		String fullname = name + " " + "Kron"; 
		System.out.println(fullname);
		
//		------------------------------------------------------------------------------------------
		
		StringBuilder sb = new StringBuilder("Bruce Springsteen ");
		
		sb.append("is the artist ever");
		System.out.println(sb);
		
		sb.insert(24, " greatest");
		System.out.println(sb);
		
		sb.replace(34,  40, "rock singer");
		System.out.println(sb);
		

	}

}
