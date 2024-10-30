package poly;

public class AnimalTest {
	public static void main(String[] args) {
		// 좌우의 타입이 맞는 경우
		Animal ani = new Animal();
		ani.move();

		// 부모타입에 자식 객체 대입
		// 부 = 자 는 허용
		// 참조변수인 dog는 선언된 Animal의 메서드만 호출 가능
		Animal dog = new Dog();
		dog.move();
//		dog.bark();  오류

		// 자식 타입에 부모 객체 대입
		// 자 = 부 는 원칙적으로 x
//		Dove dove = new Animal();
	}
}
