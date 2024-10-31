package interfacetset;

public class Marine implements Unit{
	@Override
	public void move() {
		System.out.println("마린 이동");
	}
	@Override
	public void attack() {
		System.out.println("마린 공격");
	}
	
	void bunker() {
		System.out.println("벙커에 숨기");
	}
}
