
public class ContinueTest {
	public static void main(String[] args) {
		
		int i =0;
		
//		for(i = 1; i <= 10; i++) {
		// 7을 찾으면 밑에 있는 코드 건너뛰기
//			if(i == 7) {
//				continue;	// 다음 단계로	
//			}
//			System.out.println(i);
//		}
		
		// continue 밑에 코드가 없다면 아무 의미 없다.
		for(i = 1; i <= 20; i++) {
			if(i == 13) {
				continue;	
			}
			System.out.println(i);
			
			
		}
	}
}
