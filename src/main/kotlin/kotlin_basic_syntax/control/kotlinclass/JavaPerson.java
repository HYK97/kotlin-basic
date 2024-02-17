package kotlin_basic_syntax.control.kotlinclass;

public class JavaPerson {
	private String name;
	private int age;

	public JavaPerson(String name, int age) {
		// validate age
		if (age <= 0) {
			throw new IllegalArgumentException("Age must be greater than 0");
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
