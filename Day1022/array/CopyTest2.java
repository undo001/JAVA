package array;

public class CopyTest2 {

	public static void main(String[] args) {
		// 참조형의 복사
		int[] ar = { 1, 2, 3 };
		int[] ar2 = ar; // 주소값

		ar2[0] = 100;

		System.out.println("ar[0]: " + ar[0]);
		System.out.println("ar2[0]: " + ar[0]);

	}

}
