package exception;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int b = sc.nextInt();
		
		try {
			int c = a / b;
			System.out.println("c= " + c);
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나누기 예외 발생");
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}
