package poly;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();

		// 업캐스팅: 자식타입을 -> 부모타입으로 변환
		// 항상 안전하다.
		// 자동 형변환이 가능해서 캐스트 연산자 생략가능
		Animal up = (Animal) dog;
		up.move();
//		up.bark(); 오류
		
		// 다운캐스팅: 부모타입 -> 자식타입으로 변환
		// 위험할 수 있다.
		// 캐스트 연산자 생략하면 에러
		Dog down = (Dog)ani;
//		down.move();
//		down.bark();
		
		
	}
}
