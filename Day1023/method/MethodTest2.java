package method;

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(calcSum(1, 10));
		System.out.println(calcSum(20, 10));
		System.out.println(calcSum(10, 10));
		System.out.println(calcSum(10, 1));

	}

	static int calcSum(int from, int to) {
		int sum = 0;

		if (from > to) {
			int temp = to;
			to = from;
			from = temp;
		}

		for (int i = from; i <= to; i++) {
			sum += i;
		}

		return sum;
	}

}
