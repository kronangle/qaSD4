package lab16c;

import java.util.ArrayList;

public class SkilledWorker extends Employee{
	
	ArrayList<String> skills = new ArrayList<>();
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	public String getSkills () {
		StringBuilder sb = new StringBuilder();
		for (String skill : skills) {
			sb.append("\n"+skill);
		}
		return sb.toString();
	}
	
	public SkilledWorker(String name) {
		super(name, "Skilled Worker");
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString() + "Skills:" + getSkills()).toString();
	}
	
}
