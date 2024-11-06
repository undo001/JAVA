package method;


public class MethodTest3 {
	public static void main(String[] args) {
		for(int dan = 2; dan <=9; dan++) {
			innerFor(dan);
		}
	}

	static void innerFor(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + + i + " = " + (num * i));
		}
		
		System.out.println("==============");
	}

}
