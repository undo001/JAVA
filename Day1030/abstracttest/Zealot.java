package abstracttest;

public class Zealot extends Unit {
	@Override
	void move() {
		System.out.println("질럿 이동");
	}

	@Override
	void attack() {
		System.out.println("질럿 공격");
	}
}
