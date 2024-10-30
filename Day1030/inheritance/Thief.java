package inheritance;

public class Thief extends Human {
	String item;
	int star;
	
	public Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	@Override
	void intro() {
		System.out.println(item + " 전문 털이범 전과 " + star + "범입니다.");
	}
	void steal() {
		System.out.println("훔친다.");
	}
}
