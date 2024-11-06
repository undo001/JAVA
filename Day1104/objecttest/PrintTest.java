package objecttest;

public class PrintTest {
	public static void main(String[] args) {
		// println(); => 출력하고 개행
		// print(); => 출력만
		// printf(); => (출력하고 싶은 형태, %자리에 들어갈 변수...)
		int i = 123;
		double d = 3.14;
		String str = "대한민국";

		System.out.println("i: " + i + " d: " + d + " str: " + str);
		// %d: 정수
		// %f: 실수
		// %.nf" n은 표현하고 싶은 소수점 자리
		// %s: 문자열
		// %n: 개행
		System.out.printf("i: %d d: %.2f str: %s\n", i, d, str);

		System.out.println("프로그램 종료");
	}
}
