
public class Human {
	private int age;
	String name;
	double height;
	double weight;

	// 초기화 블록, if문이나 반복문 가능
	{
		height = 100.0;
		weight = 100.0;
	}

	public Human() {
	}

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Human(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human(int age, String name, double height, double weight) {
		this(age, height, weight); // 이 클래스안의 다른 생성자를 호출,
		// 또한 다른 생성자를 호출해서 사용할경우 가장 위에서 선언해야 한다.
		this.name = name;
	}

	void intro() {
		System.out.println("안녕 " + age + "살 " + name + "입니다.");
	}
}
