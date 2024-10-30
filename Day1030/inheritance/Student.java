package inheritance;

public class Student extends Human {
	int stdNum; // 학번
	String major; // 전공

	public Student(int age, String name, int stdNum, String major) {
		super(age, name);
		this.stdNum = stdNum;
		this.major = major;
	}
	
	@Override
	// 메서드의 이름이 같아야 한다.
	// 매개변수가 같아야 한다.
	// 반환타입이 같아야 한다.
	void intro() {
		super.intro();
		System.out.println(major + "학과 " + stdNum + "학번 " + name + "입니다.");
	}

	void study() {
		System.out.println("공부한다.");
	}
}
