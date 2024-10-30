package abstracttest;

public abstract class Unit { // 추상 메소드뿐만 아니라 일반 메소드를 가질수 있으며 무조건 한개라도 추상 메소드가 있을경우
	// 클래스도 추상 클래스가 되어야 한다. 또한 객체 생성을 못한다. 즉, 추상클래스는 미완성이다.
	int health = 100;

	abstract void move();

	abstract void attack();

	public void print() {
		System.out.println("아무거나");
	}
}
