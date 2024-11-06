package objecttest;

public class BoxingTest2 {
	public static void main(String[] args) {
		String a = "12";
		String b = "34";

		// 이어 붙이기
		System.out.println(a + b);
		// 덧셈(정수로 변환 후 1 더하기)----- 하지만 이렇게 하기 보다는 정수로 변환하고 더하는 것을 추천
		System.out.println(Integer.parseInt(a + b) + 1); // ***주의***
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

	}
}
