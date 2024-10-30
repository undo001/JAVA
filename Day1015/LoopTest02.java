
public class LoopTest02 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i = 25; i < 78; i++) {
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println((i-25) + "번 반복완료");
	}

}
