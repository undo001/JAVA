package inheritance2;

public class Thief extends Human {
	String item;
	int star;
	
	public Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	void steal() {
		System.out.println("훔친다.");
	}
}
