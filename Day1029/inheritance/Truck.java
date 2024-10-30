package inheritance;

public class Truck extends Car {
	int ton;

	// 사용자정의 생성자
	public Truck(String name, boolean gasoline, int ton) {
		super(name, gasoline);
		this.ton = ton;
	}
	
	void load() {
		System.out.println("짐을 싣는다");
	}
}
