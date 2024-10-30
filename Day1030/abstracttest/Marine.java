package abstracttest;

public class Marine extends Unit{
	@Override
	void move() {
		System.out.println("마린 이동");
	}
	@Override
	void attack() {
		System.out.println("마린 공격");
	}
	
	void bunker() {
		System.out.println("벙커에 숨기");
	}
}
