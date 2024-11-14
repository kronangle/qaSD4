package lab16c;

public class Program {

	private static String[] names = {"Alex", "Dave", "Peter", "Jack","Henry", "Phillip"};
	private static String[] titles = {"Technician", "Plumber", "Carpenter", "Electrician"};
	
	public static void main(String[] args) {
		
		Manager man = new Manager(names[0]);
		
		man.addEmployee(new Employee(names[1], titles[0]));
		man.addEmployee(new Employee(names[2], titles[1]));
		man.addEmployee(new Employee(names[3], titles[2]));
		man.addEmployee(new Employee(names[4], titles[3]));
		
		SkilledWorker worker = new SkilledWorker(names[5]);
		worker.addSkill("Photoshop");
		worker.addSkill("Excel");
		worker.addSkill("Java");
		worker.addSkill("Mimeo");
		worker.addSkill("TX100");
		
		man.addEmployee(worker);
		
		System.out.println(man);
	}

}
