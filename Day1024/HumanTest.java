
public class HumanTest {
	public static void main(String[] args) {

		Human sa = new Human();
//		System.out.println(sa.age);
		System.out.println(sa.height);
		System.out.println(sa);

		Human hong = new Human(30, "홍길동");
//		hong.age = 30;
//		hong.name = "홍길동";

		System.out.println(hong);
		hong.intro();

		Human son = new Human(35, "손오공");
		System.out.println(son);
		son.intro();
		
		Human jeo = new Human(30, "저팔계", 133.3, 132.3);
		System.out.println(jeo.height);
		System.out.println(jeo.weight);

	}
}
