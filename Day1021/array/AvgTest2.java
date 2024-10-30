package array;

import java.util.Scanner;

public class AvgTest2 {
	public static void main(String[] args) {

		// n명의 국어 점수들의 총합계와 평균값 구하기

		Scanner sc = new Scanner(System.in);

		int total = 0;
		double avg = 0;

		while (true) {

			System.out.print("학생 수: ");
			int p = sc.nextInt();
			int[] scores = new int[p];

			if (p > 0) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번째 학새의 점수를 입력해주세요: ");
					scores[i] = sc.nextInt();
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수는: " + scores[i]);
				}

				for (int i = 0; i < scores.length; i++) {
					total += scores[i];
				}
				avg = total / p;
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}
		}

		System.out.println("모든 점수의 합은 " + total + "점 입니다");
		System.out.println("학생들의 평균은 " + avg + "점 입니다.");

		sc.close();

	}
}
