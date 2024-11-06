package generic_human;

public class Student extends Human {
	int stdNum; // 학번
	String major; // 전공

	void study() {
		System.out.println("공부한다.");
	}

	@Override
	void intro() {
		System.out.println("학생의 자기소개");
	}

}
