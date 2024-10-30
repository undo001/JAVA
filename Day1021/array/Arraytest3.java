package array;

public class Arraytest3 {
	public static void main(String[] args) {

		// 5명의 성적을 저장
		int[] scores = new int[5];
		scores[0] = 77;
		scores[1] = 67;
		scores[2] = 87;
		scores[3] = 76;
		scores[4] = 71;

		// 주의: 방의 개수 - 1번 인덱스까지만 존재

////		scores[5] = 100;
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
//		System.out.println(scores[5]);	//없는 인덱스

		// 반복문 이용해서 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생 점수는 " + scores[i]);
		}

	}
}
