package interfacetset;

public class Mutal implements Unit{
	
	@Override
	public void move() {
		System.out.println("뮤탈 이동");
	}
	
	@Override
	public void attack() {
		System.out.println("뮤탈 공격");
	}

}
