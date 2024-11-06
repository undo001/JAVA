package method;

public class MethodTest4 {
	public static void main(String[] args) {
		
		calcSum(1,10);
	}

	static void calcSum(int from, int to) {
		int sum = 0;

		for (int i = from; i <= to; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		return;
	}

}
