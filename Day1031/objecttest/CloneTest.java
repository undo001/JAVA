package objecttest;

public class CloneTest {
	public static void main(String[] args) {

		// 주소값을 대입 했으므로 원본과 사본이 동일하게 변화
//		int[] ar = {1, 2, 3};
//		int[] ar2 = ar;
//		
//		ar[0] = 100;
//		
//		System.out.println(ar2[0]);

		//복제를 해서 원본과 사본은 독립적
		int[] ar = { 1, 2, 3 };
		int[] ar2 = ar.clone(); // .clone() 하면 사본이 만들어짐

		System.out.println(ar);
		System.out.println(ar2);

		ar[0] = 100;

		System.out.println(ar2[0]);
	}
}
