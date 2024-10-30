package array;

public class EqualTest {

	public static void main(String[] args) {
		// ==
		// 기본형

		int i = 12;
		int i2 = 12;

		if (i == i2) {
			System.out.println("기본형 같다");
		}

		// 참조형
		// == : 주소지가 같은지 비교
		int[] ar = new int[] { 1, 2, 3 };
		System.out.println(ar);

		int[] ar2 = new int[] { 1, 2, 3 };
		System.out.println(ar2);

		int[] ar3 = ar;
		System.out.println(ar3);
		
		if (ar == ar2) {
			System.out.println("참조형 같다");
		}
		
		System.out.println("======================");
		
		if (ar == ar3) {
			System.out.println("참조형 같다");
		}
		
		
	}

}
