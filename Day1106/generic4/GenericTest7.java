package generic4;

//import maptest.Human;

public class GenericTest7 {
	public static void main(String[] args) {
//		Human h = new Human(28, "김상현");
//		Human h2 = new Human(30"김상현");
//		max(h, h2); 코드 오류

		int result = max(2, 1);
		System.out.println(result);

	}

	// 일반 적으로 제네릭에는 연산자를 사용 못하지만 자바에서 제공하는 comparalbe를 사용하면 T의 제한을 두어
	// 제네릭 메서드 안에 연산자를 사용한 조건식을 사용할 수 있다.
	static <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0) {
			return a;
		} else {
			return b;
		}
	}
}
