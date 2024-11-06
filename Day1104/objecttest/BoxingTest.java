package objecttest;

public class BoxingTest {

	public static void main(String[] args) {
		// 박싱: 기본형 -> 참조형
		// 문자열 < - > 정수
//		Integer wrapInt = new Integer("629");
//		System.out.println(wrapInt + 1);  // wrapInt가 정수로 변환 되어 있다.

		// 정수 -> 문자열
		Integer wrapInt = 629;
		String str = wrapInt.toString();
		System.out.println(str + 1); // 정수가 문자열로 변환 되어 있다.

		// 문자열 -> 정수
		int num = Integer.parseInt(str);
		System.out.println(num + 1);

	}

}
