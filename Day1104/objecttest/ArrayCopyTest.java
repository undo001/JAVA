package objecttest;

public class ArrayCopyTest {
	public static void main(String[] args) {
		// 배열 전체 복사
//		int[] ar = {1, 2, 3, 4, 5};
//		int[] ar2 = ar.clone();

		// 배열 복사
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = new int[5];
	
		System.arraycopy(ar, 2, ar2, 2, 2);
	
		for(int i : ar2) {
			System.out.println(i);
		}
		
	}
}
