package abstracttest;

public class StarTest {
	public static void main(String[] args) {
		Marine marin = new Marine();
		marin.move();
		marin.attack();

		Zealot zealot = new Zealot();
		zealot.move();
		zealot.attack();
	}
}
