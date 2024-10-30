package abstracttest;

public class StarTest2 {
	public static void main(String[] args) {
		Unit[] arUnit = {
			new Marine(),
			new Zealot(),
			new Mutal()
		};
		
		for(Unit u : arUnit) {
			u.move();
			u.attack();
		}
		
//	Unit unit = new Unit();  // 추상클래스 이므로 객체 생성안됨.
		
	}
}
