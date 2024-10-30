package abstracttest;

public class Mutal extends Unit{
	
	@Override
	void move() {
		System.out.println("뮤탈 이동");
	}
	
	@Override
	void attack() {
		System.out.println("뮤탈 공격");
	}
}
