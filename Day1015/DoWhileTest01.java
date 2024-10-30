
public class DoWhileTest01 {
	public static void main(String[] args) {
		
		
		int i = 1;
		
		// 일단 do 블록을 실행한 후에 조건식을 보는 특징
		do {
			
			System.out.println(i + "번 반복하고 있습니다.");
			i++;
		}while(i >= 5);
		
		System.out.println(i-1);
	}
}
