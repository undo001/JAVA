import java.util.Scanner;

public class Ifelse03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int i = sc.nextInt();

		if (i == 1) {
			System.out.println("정수 1이 입력되었습니다.");
		}

		sc.close();
		System.out.println("프로그램 종료");
	}

}
