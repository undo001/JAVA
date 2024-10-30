import java.util.Scanner;

public class AvgTest {

	public static void main(String[] args) {
		// 과목(국어, 영어, 수학) 3개를 입력받아서 총점과 평균(소수점)
		// 국어: 76
		// 영어: 88
		// 수학: 99
		// 총점: 263
		// 평균: 87.66666666

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int a = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int b = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int c = sc.nextInt();
		
		int all = a + b + c;
		
		double avg = (double)all / 3;
		
		System.out.println("총점은" + all);
		System.out.println("평균은" + avg);
		sc.close();
	}

}
