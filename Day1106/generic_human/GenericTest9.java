package generic_human;

import generic3.Box;

public class GenericTest9 {

	public static void main(String[] args) {
		Human h = new Human();
		Box2<Human> bh = new Box2<Human>(h);
		bh.intro();

		Student s = new Student();
		Box2<Student> bs = new Box2<Student>(s);
		bs.intro();

	}

	static <T> void prinMan(Box<? extends Human> box) {
		box.get().intro();
	}
}
