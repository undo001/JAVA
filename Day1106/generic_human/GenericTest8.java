package generic_human;

public class GenericTest8 {

	public static void main(String[] args) {
		Human h = new Human();

		Box2<Human> bh = new Box2<>(h);
		bh.intro();

		Student s = new Student();
		Box2<Human> bs = new Box2<>(s);
		bs.intro();

//		int num = 10;
//		Box2<Human> bh2 = new Box2<>(num);

	}
}
