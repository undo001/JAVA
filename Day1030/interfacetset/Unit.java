package interfacetset;

public interface Unit {
	int HEALTH = 100; // 상수 취급

	abstract void move();

	abstract void attack();

	default void die() {
		System.out.println("다이");
	}

	static void moveAttack(Unit u) {
		u.move();
		u.attack();
	}
}
