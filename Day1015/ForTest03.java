
public class ForTest03 {

	public static void main(String[] args) {
		// 제어변수 i
		// 5번 반복 반복문
		
		int i = 0;	// 초기화식
		int sum = 0;	// 더해서 덧셈 결과 쌓을 변수
		
		while (i <= 5) {	// 증감식
			sum += i;
		    System.out.println(i + "번 반복하고 있습니다.");
		    i++;	// 증감식은 반복코드가 다 끝났을때 마지막에

		}
		System.out.println(sum);
	}

}
