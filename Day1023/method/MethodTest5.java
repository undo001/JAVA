package method;

public class MethodTest5 {
	public static void main(String[] args) {
		int num = 2;
		getDouble(num);
		System.out.println("num: " + num);
	}

	static void getDouble(int num) {
		num++;
	}

}
