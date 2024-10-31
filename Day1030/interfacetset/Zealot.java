package interfacetset;

public class Zealot implements Unit {
	@Override
	public void move() {
		System.out.println("질럿 이동");
	}

	@Override
	public void attack() {
		System.out.println("질럿 공격");
	}
}
