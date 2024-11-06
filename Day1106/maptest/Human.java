package maptest;

public class Human {
	int age;
	String name;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.length() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (this.age == other.age && this.name.equals(other.name));
		}
		return false;
	}

}
