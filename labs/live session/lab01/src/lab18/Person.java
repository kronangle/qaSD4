package lab18;

public class Person implements Comparable<Person> {

	String name;
	int age;
	/**
	 * @param name
	 * @param age
	 */
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Person p1) {
		return this.age - p1.age;
	}


	
	
	
	
}
