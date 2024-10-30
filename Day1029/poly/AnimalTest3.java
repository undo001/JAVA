package poly;

public class AnimalTest3 {
	public static void main(String[] args) {
		Dog happy = new Dog();
		
		AnimalTest3 at3 = new AnimalTest3();
		at3.testAnimal(happy);
		
//		at3.test1(happy);
//		Dove dove = new Dove();
//		at3.testAnimal(dove);
	}

	void testAnimal(Animal animal) {
		// Animal animal = happy;(업 캐스팅)
		Dog mydog = (Dog)animal; // 다운캐스팅
		mydog.move();
		mydog.bark();
		
	}
	
//	void test1(Dog dog) {
//		dog.bark();
//		dog.move();
//	}
}
