package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest4 {
	public static void main(String[] args) {
		//int[] numes = {3, 4, 5};
		List<Integer> list = new ArrayList<>(Arrays.asList(11,22,33,44,55));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3));
		
		//합집합
		list.addAll(list2);
		System.out.println("합집합: ");
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\n============");
		
		//차집합
		list.removeAll(list2);
		System.out.print("차집합: ");
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\n============");
		
	}
}
