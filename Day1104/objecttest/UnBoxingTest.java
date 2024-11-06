package objecttest;

public class UnBoxingTest {

	public static void main(String[] args) {
		// 언박싱: 참조형 -> 기본형
		Integer wrapInt = 639;
		int i = wrapInt.intValue();

		Integer wrapInt2 = 639;
		int i2 = (int) wrapInt2;
		System.out.println(i2);

	}

}
