package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Integer> arNum = new ArrayList<>();

		// 랜덤값 : 정수 값을 주기 위해 함.
//		System.out.println((int)(Math.random()*10));
		System.out.println(arNum.isEmpty());
		// 1 ~ 45 뽑기
		for (int i = 0; i < 6; i++) {
			arNum.add((int) (Math.random() * 45) + 1);
		}
		// arNum.size가 0이야?
		System.out.println(arNum.isEmpty());

		for (int i : arNum) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("===============");

		for (int i = 0; i < arNum.size(); i++) {
			System.out.print(arNum.get(i) + " ");
		}
	}

}
