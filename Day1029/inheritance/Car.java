package inheritance;

public class Car {
	String name;
	boolean gasoline;

	// 사용자정의 생성자
	public Car(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
	}
		
	// 일반 메소드는 정적 필드는 되고 정적 메소드를 가져올 수 없다.
	void run() {
		if (gasoline) {
			System.out.println("부릉부릉");
		} else {
			System.out.println("덜컹덜컹");
		}
	}

	void stop() {
		System.out.println("끼이익");
	}
}
