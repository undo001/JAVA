package method;

public class MethodTest7 {
	public static void main(String[] args) {
		getSum(1,2);
		getSum(1,2,3);
		getSum(1,2,3,4);
		getSum(1);
	}

	static void getSum(int... num) {
		int sum = 0;
		
		for(int i : num) {
			sum +=i;
		}
		System.out.println(sum);
		System.out.println("getSum(): 가변인수");
	}
	
	static void getSum(int num) {
//		int sum =0;
//		System.out.println(num);
		System.out.println("getSum() 기본형");
	}

}
