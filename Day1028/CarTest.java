
public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("생성하기 전에도 접근 가능: " + Car.carNum);
		
//		System.out.println(Car.name); // static이 있어야만 코드가 실행되기전 미리 올라가있음으로 접근이 가능하나 static으로
		// 정의가 안되있으면 접근할 수 없음
		
		Car korando = new Car("코란도", false);
		System.out.println(korando.name + ":" + Car.carNum);
//		korando.run();
		
		Car equus = new Car("에쿠스", true);
		System.out.println(equus.name + ":" + Car.carNum);
//		equus.name = "에쿠스2";
//		equus.run();
		
		Car pride = new Car("프라이드", true);
		System.out.println(pride.name + ":" + Car.carNum);
		
		
		System.out.println(korando.carNum);
	
	}
}
