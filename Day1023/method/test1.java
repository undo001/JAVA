package method;

public class test1 {

	public static void main(String[] args) {
		
		test1 t1 = new test1();
		
		int ss = t1.calcSum(1, 10);
		System.out.println(ss);

	}
	
	int calcSum(int dog, int cow) {
		int sum = 0;
		for(int i  = dog; i < cow; i++) {
			sum += i;
		}
		return sum;
	}
	
	
}
