package generic4;

public class GenericTest5 {
	// 제네릭 메서드 사용
	public static void main(String[] args) {
		int num = 10;
		print(num);

		double dNum = 3.14;
		print(dNum);

		String str = "Hello";
		print(str);

	}

	// 연산자는 모든 타입에 대해 동작하지 않아 제네릭이 될 수 없다.
	static <T> void print(T a) {
		System.out.println(a);
	}
}
