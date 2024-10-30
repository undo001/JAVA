import java.util.Scanner;

public class Practive01 {

	public static void main(String[] args) {
		// 양의 정수를 입력받아서 홀수인가 짝수인가 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하시오: ");

		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println(i + ": 짝수입니다.");
		}
		else {
			System.out.println(i + ": 홀수입니다.");
		}
		sc.close();
	}

}
