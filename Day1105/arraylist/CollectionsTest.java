package arraylist;

import java.util.*;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> arName = new ArrayList<>();
		arName.add("장보고");
		arName.add("김유신");
		arName.add("강감찬");
		arName.add("을지문덕");

		for(String s : arName) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		Collections.sort(arName);
		
		System.out.println("===================");
		
		for(String s : arName) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//가나다순 내림차순 : sort()로 먼저 정렬한 후에 호출
		Collections.reverse(arName);
		
		System.out.println("===================");
		
		for(String s : arName) {
			System.out.print(s + " ");
		}
		
//		System.out.println(arName.get(1));
		System.out.println();
		
		Collections.shuffle(arName);
		
		System.out.println("===================");
		
		for(String s : arName) {
			System.out.print(s + " ");
		}
		System.out.println();
	
	}
}
