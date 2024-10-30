
public class Car {
	String name;
	boolean gasoline;
	//carNum 필드에 static 지정자를 붙여 정적으로 선언하며, 차 객체를 만들 때 마다 생성자에서 carNum 필드를 1씩 증가 시킴.
	//따라서 매번 carNum 필드를 출력했는데 정상적으로 잘 증가함.
	static int carNum;

	// 사용자정의 생성자
	public Car(String aName, boolean aGasoline) {
		name = aName;
		gasoline = aGasoline;
//		carNum = 1000;
		carNum++;
		final static int BRANDNO = 100;
	}
	
	
	static void resetNum() {
		carNum = 0;
	}
	
	static void printNum() {
		System.out.println("현재 출고 대수: " + carNum);
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
