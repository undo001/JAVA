package inheritance;

public class HumanTest2 {
	public static void main(String[] args) {
		Human kim = new Human(20, "김상현");
		Human lee = new Student(42, "이승우", 9312345, "경영");

		introHuman(kim);
		introHuman(lee);
	}

	static void introHuman(Human who) {
		who.intro(); // lee가 들어오면 업캐스팅이 발생
	}
}
