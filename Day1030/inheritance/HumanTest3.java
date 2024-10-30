package inheritance;

public class HumanTest3 {
	public static void main(String[] args) {
		Human[] arHuman = { new Human(29, "김상현"),
				new Student(42, "이승우", 9312345, "경영"),
				new Soldier(45, "강감찬", 12345),
				new Thief(15, "홍길동", "부자집", 2), 
				};

		dumpGroup(arHuman);

	}

	static void dumpGroup(Human[] humans) {
		for (Human h : humans) {
			h.intro();
		}
	}
}
