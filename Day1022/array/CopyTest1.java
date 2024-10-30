package array;

public class CopyTest1 {

	public static void main(String[] args) {
		// 기본형의 복사
		int i = 10;
		int i2 = i;

		i2 = 100; // 원본과 사본은 독립적, 서로 영향을 끼치지 않음.

		System.out.println("i값: " + i);
		System.out.println("i2값: " + i2);

	}

}
