package lab16c;

import java.util.ArrayList;

public class Manager extends Employee{

	private ArrayList<Employee> employees = new ArrayList<>();

	/**
	 * @param name
	 * @param jobTitle
	 * @param names
	 * @param titles
	 */
	public Manager(String name) {
		super(name, "Manager");
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public String getEmployee() {
		StringBuilder sb = new StringBuilder();
		for (Employee emp : employees) {
			sb.append("\n"+ emp.toString());
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString() + "\n" + getEmployee()).toString();
	}

}
