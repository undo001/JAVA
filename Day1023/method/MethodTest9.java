package method;

import java.util.Scanner;

public class MethodTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		int from = sc.nextInt();

		System.out.print("마지막 숫자: ");
		int to = sc.nextInt();

		System.out.println("짝수의 합: " + getSum(from, to));
		sc.close();

	}

	static int getSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
