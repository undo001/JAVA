package inheritance2;

public class Soldier extends Human {
	int milnum;

	public Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}

	void fight() {
		System.out.println("총 쏘고 싸우기");
	}

}
