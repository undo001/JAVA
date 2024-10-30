
public class ForTest02 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하자
		int i = 0;
		int sum = 0;
//		
//		for(i = 1; i <= 100; i++) {
//				sum += i;
//		}
//		System.out.println(sum);
		
		// 1부터 100까지의 숫자 중에서 홀수들의 합계
		for (i = 1; i <= 100; i++) {
			
			if(i % 2 != 0) {					
				sum +=i;				
			}
		}
		System.out.println(sum);
	}

}
