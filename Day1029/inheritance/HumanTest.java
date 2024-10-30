package inheritance;

public class HumanTest {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 100, "경영");
		lee.intro();
		lee.study();
			
		Truck porter = new Truck("포터", true, 1);
		porter.run();
		porter.stop();
		porter.load();
		
		Graduate park = new Graduate(35, "박대희", 101, "전산", "웹 보안연구");
		park.intro();
		park.study();
		park.research();
		System.out.println(park.age);
		System.out.println("=============================");
		
		@SuppressWarnings("unused")
		Graduate na = new Graduate();
		
		Soldier kang = new Soldier(45, "감강찬", 1234);
		kang.intro();
		kang.fight();
		
		Thief hong = new Thief(15, "홍길동", "부자집", 2);
		hong.intro();
		hong.steal();
	
	
	
	
	}

}
