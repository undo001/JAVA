package array;

public class Arraytest2 {
	public static void main(String[] args) {

//		int num;	//변수 선언
//		num = 10;	//값 대입
//		int num = 10;	//선언과 동싱에 값대입 => 초기화

//		배열을 선언
//		int[] scores;
//		
//		배열을 생성
//		scores = new int[5]; //5개의 방을 생성

		int size = 10;
		int[] scores = new int[size]; // 선언과 생성을 동시에

		// 방의 크기(길이) : 방을 몇개 가지고 있나?
		System.out.println("방의 개수: " + scores.length);

	}
}
