package arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest5 {
	public static void main(String[] args) {
		
		List<Integer> arNum = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> sub = arNum.subList(1, 4);
		
		for(int i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();
		//원본 건드리고
		arNum.set(2, 100);
		//서브리스트 루프
		for(int i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//원본을 건드리면 사본이 바뀌고 사본을 건들면 원본이 바뀐다
	}
}
