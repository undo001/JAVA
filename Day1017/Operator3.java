
public class Operator3 {
	public static void main(String[] args) {
		int value = 2;
		int a = ++value;
		System.out.println("단항연산자가 앞에 붙었을때");
		System.out.println("value: " + value);
		System.out.println("a: " + a);
		
		value = 2;
		a = value++;
		// value 1 증가
		System.out.println("단항연산자가 뒤에 붙었을때");
		System.out.println("value: " + value);
		System.out.println("a: " + a);
		value++;
		System.out.println(value);
	}
}
