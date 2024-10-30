package method;

public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println(calcSum(1, 10));
		System.out.println(calcSum(15, 100));
		
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);
		
		
	}
	
	static int calcSum(int from, int to) {
		int sum = 0;
		for(int i=from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	
}
