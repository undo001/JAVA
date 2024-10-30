package inheritance;

public class Graduate extends Student{

	String thesis;
	
	public Graduate() {
		super();
		System.out.println("Graduate() 기본 생성자 호출");
	}
	
	public Graduate(int age, String name, int stdNum, String major, String thesis) {
		super(age, name, stdNum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("연구한다.");
	}
}

// 상속은 생성자가 상속되는 것이 아닌 변수와 메서드가 상속된다.