
public class ForTest03 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하자
		int i = 0;
		int sum = 0;
		
		// 1부터 100까지의 숫자 중에서 4의 배수들의 합계
		for (i = 4; i <= 100; i+=4) {	
				sum += i;				
		}
		System.out.println(sum);
		
	}

}
