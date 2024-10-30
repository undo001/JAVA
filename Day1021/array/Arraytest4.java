package array;

public class Arraytest4 {
	public static void main(String[] args) {

		// 배열 초기화
//		int[] scores = new int[] {77, 67, 87, 76, 71};
//		int[] scores;
//		scores = new int[] {77, 66, 87, 76, 71};
//		=> 선언과 생성을 따로 할 때는 new int[] 생략 불가능
		int[] scores = { 77, 67, 87, 76, 71 };

		// 각 학생들 점수 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("===========================");
		// 배열을 재사용
		scores = new int[] { 55, 22 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

	}
}
