import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			System.out.println("숫자를 입력하세요(끝날 때 0): ");
			num = sc.nextInt();
			sum += num;
		}while(num != 0);
		System.out.println("총 합계: " + sum);
		sc.close();
	}
}
