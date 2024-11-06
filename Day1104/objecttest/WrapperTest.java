package objecttest;

public class WrapperTest {
	public static void main(String[] args) {
		Integer num = 10;

		// 메모리 얼마나 차지 하는지
		System.out.println(Integer.BYTES);
		System.out.println(Double.BYTES);

		// 기본형이 무엇인지
		System.out.println(Integer.TYPE);
		System.out.println(Double.TYPE);

		// 표혆라 수 있는 최솟값
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);

		// 표현할 수 있는 최댓값
		System.out.println(Long.MAX_VALUE);

	}
}
