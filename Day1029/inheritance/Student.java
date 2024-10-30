package inheritance;

public class Student extends Human{
	int stdNum; //학번
	String major; // 전공

	public Student(){
		super();
		System.out.println("Student() 기본 생성자 호출");
	}
		
	public Student(int age, String name, int stdNum, String major) {
		super(age, name);	// 부모 클래스의  age, name을 가져옴, super()를 쓰고 싶을경우 기본 생성자 코드 작성시
		// 사용 가능.
		this.stdNum = stdNum;
		this.major = major;
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}
