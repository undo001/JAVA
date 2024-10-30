package inheritance;

public class Human {
	int age;
	String name;
	
	
	public Human() {
		System.out.println("Human() 기본 생성자 호출");
	}
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void intro() {
		System.out.println("안녕 " + age + "살 " + name + "입니다.");
	}
}
