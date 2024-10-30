package array;

public class ForEachTest {

	public static void main(String[] args) {
		// 향상된 for문, for each 문
		int[] score = { 88, 94, 72, 75, 23 };
		int[] score2 = { 88, 94, 72, 75, 23 };
		int total = 0;

//		for(int i = 0; i < score.length; i++) {
//			total += score[i];
//		}

		// 초기화를 얼마로 해야할지 OR 조건식을 어떻게 해야 에러없이 끝날가
		// 이런 고민을 할 필요가 없다.
		// 0번 인덱스부터 시작하고 더이상 뽑아올 요소가 없을 경우 반복문 자동종료
		// for(변수형 + 블록내 쓸 변수명 : 반복대상), i = score[0], i = score[1]... 자동으로 들어감
		// 집합과 같은 인덱스가 정해져있을 경우 사용
		for (int i : score) {
			
			total += i;
		}

		System.out.println("총점" + total);
		System.out.println("평균" + ((double) total / score.length));
	}

}
