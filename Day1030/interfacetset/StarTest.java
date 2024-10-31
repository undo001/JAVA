package interfacetset;

public class StarTest {
	public static void main(String[] args) {
		Marine marine = new Marine();
		marine.move();
		marine.attack();

		Zealot zealot = new Zealot();
		zealot.move();
		zealot.attack();
		System.out.println("--------------------");
		
		Unit.moveAttack(marine);
	}
}
