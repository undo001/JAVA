package array;

public class NullTest {
	public static void main(String[] args) {
		// null : 주소값이 없는 상태
		int[] ar = new int[] { 1, 2, 3 };
		System.out.println(ar[0]);
		
		ar = null; // 주소값이 없어진 상태, 힙을 가리킬 수 없음
		System.out.println(ar);
		
		// == : 주소값 비교 null 체크 가능
		if(ar == null) {
			System.out.println("ar은 null");
		}
		
		String str = null; // 주소값이 없는 상태, 가리키고 있는 대상 x
		String str2 = ""; // 주소값이 있는 상태 가리키고 있는 대상 o
	}
}
