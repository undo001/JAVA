package exception;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
//		int a = 2;
//		int b = 0;
//		int c = a / b;
//
//		System.out.println("c= " + c);
//			
//		System.out.println("프로그램 종료");

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int b = sc.nextInt();

		if (b != 0) {
			int c = a / b;
			System.out.println("c= " + c);
		}

		System.out.println("프로그램 종료");

		sc.close();
	}
}
