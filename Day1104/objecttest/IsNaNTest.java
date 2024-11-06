package objecttest;

public class IsNaNTest {
	public static void main(String[] args) {
		double d = Math.sqrt(-2);
		// NaN : Not a Number
		if(Double.isNaN(d)) {
			System.out.println(d);
			System.out.println("숫자가 아님");
			System.exit(0);
		}
		
		System.out.println(d);
		System.out.println("숫자가 맞음");
	}
}
