package inheritance;

public class HumanTest {
	public static void main(String[] args) {
		// 동적바인딩
		// 1. 상속관계
		// 2. 업캐스팅 상황 (부 = 자)
		// 3. 자식 클래스가 메서드를 재정의
		// 4. 메소드를 호출하면 자식 클래스의 오버라이딩한 메서드가 호출
		Human lee = new Student(20, "홍길동", 100, "경영");
		lee.intro();
	}

}
