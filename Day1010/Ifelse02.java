import java.util.Scanner;

public class Ifelse02 {
	
	public static void main(String[] args) {
		// 점수를 입력받아 분기 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		int score = sc.nextInt();

		if (score >= 80) {
			// 조건식이 true일때 실행될 코드들
			System.out.println("여행 간다.");
		}

		// 조건식이 false라면 이쪽으로
		else
			System.out.println("못가");
		
		sc.close();
	}

}
