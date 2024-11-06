package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// ArrayList는 배열 중간에 삽입 삭제가 자유롭다( 1, 2, 3, 4, 5 에서 2를 지우면 자동으로 앞으로 땅겨져 1, 3, 4, 5 로 들어가서 동적 배열이다)
		// ctrl + shift + n : 한개만 임포트 할때
		// ctrl + shift + o : 여러개를 임포트 할때
		// ArrayList 특징: 1. 참조형이다 2. 동적배열이다 3. 배열 생성시 자동으로 방이 생성된다.
		
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		System.out.println(arNum);
		arNum.add(1);
		arNum.add(2);
		arNum.add(3);
		arNum.add(4);
		arNum.add(5);
		
		//2번 인덱스에 100을 저장하고 싶다. 배열이름.add(넣고 싶은 인덱스, 넣고 싶은 숫자);
		arNum.add(2, 100);
		//get(index);
		System.out.println("1번째 인덱스의 값은 " + arNum.get(1));
//		System.out.println("0번째 인덱스의 값은 " + arNum.get(0));
		System.out.println("================");
		
		System.out.println(arNum);
		
		for(int s : arNum) {
			System.out.println(s);
		}

		
		
	}
}
