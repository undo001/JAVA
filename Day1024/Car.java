
public class Car {
	String name;
	boolean gasoline;

	// 기본생성자: 클래스에 생성자가 단 한개도 없으면 컴파일러가 자동 생성
	public Car() {

	}

	// 생성자가 단 하나라도 있다면 컴파일러는 기본생성자를 만들어주지 않습니다.
	// 사용자정의 생성자도 필요하고 기본생성자도 필요하다면 기본생성자는 직접만들어야 함.

	// 사용자정의 생성자
	public Car(String name, boolean gasoline) {
		System.out.println(this);
		this.name = name;
		this.gasoline = gasoline;

	}

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
