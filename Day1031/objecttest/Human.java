package objecttest;

public class Human {
	int age;
	String name;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;

	}

	@Override
	public String toString() {
		return age + "세의 " + name;
	}
	
	
	// 클래스에서 객체를 생성해서 .equals()을 쓸때 필드값이 같을 경우 true를 출력하기 위해 오버라이딩함
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) { // Human human = (Human)obj;(업 캐스팅)
			Human other = (Human) obj; //다운 캐스팅
			return (this.age == other.age && name.equals(other.name));
		} else {
			return false;
		}
	}
	
	void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
}
