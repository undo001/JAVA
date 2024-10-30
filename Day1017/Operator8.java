import java.util.Scanner;

public class Operator8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";

//		if (num % 2 == 0) {
//			result = "짝수";
//		} else {
//			result = "홀수";
//		}

		System.out.println(result);
		sc.close();
	}

}
