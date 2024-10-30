
public class priority {

	public static void main(String[] args) {
		// 사칙 연산 우선순위
		int num = 1 + 3 * 2;
		System.out.println(num);

		// 소괄호가 있다면 우선적으로
		num = 0;
		num = (1 + 3) * 2;
		System.out.println(num);

		// 대입연산자(=)는 최후순위

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		//&&(and)가 ||(or)보다 우선순위가 높다.
		if (a == 1 || b == 2 && c == 10) {
			System.out.println("진실");
		} else {
			System.out.println("거짓");
		}
		
		int num2 = 2 * 3 * 4;
		System.out.println(num2);
	}

}
