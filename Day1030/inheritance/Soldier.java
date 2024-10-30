package inheritance;

public class Soldier extends Human {
	int milnum;

	public Soldier(int age, String name, int milnum) {
		super(age, name);
		this.milnum = milnum;
	}
	@Override
	void intro() {
		System.out.println("충성. 군번: " + milnum + "입니다.");
	}
	
	void fight() {
		System.out.println("총 쏘고 싸우기");
	}

}
