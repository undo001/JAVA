package method;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] num = {3, 6, 9};
		getDouble(num);
		System.out.println("num[0]: " + num[0]);
	}

	static void getDouble(int[] num) {
		num[0] = 100;
		
	}

}
