package poly;

import inheritance.Car;

public class AnimalTest4 {
	public static void main(String[] args) {
		Dog happy = new Dog();

		testAnimal(happy);

		Dove dove = new Dove();
		testAnimal(dove);
	}
	
	Car car = new Car("코란도c", false); // 자식 클래스가 아닌 경우 들어갈수도 없다.
	
	// Animal animal 즉, 자식타입은 모든 부모타입에 들어갈수 있다. 따라서 Animal 에 dog가 들어갈수 있다.
	static void testAnimal(Animal animal) {
		// Animal animal = (Animal) happy;
		animal.move();
		// 강아지인가
		if (animal instanceof Dog) {
			// 안전한 다운캐스팅
			// 원래 dog로 태어 났기 때문에 업캐스팅 해서 다시 다운 캐스팅 해도 상관없다.
			Dog mydog = (Dog)animal;
			mydog.bark();
		}
		
		// 강아지인가 다르게 쓰는 법
		if (animal instanceof Dog mydog) {
			// 안전한 다운캐스팅
			// 원래 dog로 태어 났기 때문에 업캐스팅 해서 다시 다운 캐스팅 해도 상관없다.
			mydog.bark();
		}
		
		//비둘기인가
		if (animal instanceof Dove) {
			Dove mydove = (Dove)animal;
			mydove.fly();
		}
		
		// 비둘기도 다른 방식
		if (animal instanceof Dove mydove) {
			mydove.fly();
		}
//		if (animal instanceof Car) { // 바로 오류를 터트린다.
//			Dove mydove = (Dove)car;
//			mydove.fly();
//		}
	}
}
