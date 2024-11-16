package lab13;

public class RegistrationPlateFactory {
	
	private static String[] regPlates = { "MRB1G", "RU16", "TOYS4US", "HNZ57", "PUT3", "JB007" };
	private static int count = 0;
	
	public static RegistrationPlate getNextRegistrationPlate() {
		
		if (count > regPlates.length - 1)
			throw new ArrayIndexOutOfBoundsException();
		
		RegistrationPlate plate = new RegistrationPlate(regPlates[count]);
		RegistrationPlateFactory.count++;
		return plate;
	}

}
