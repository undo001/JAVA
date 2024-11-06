package arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest1 {
	public static void main(String[] args) {
		List<String> arName = new LinkedList<>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1, "노태우");

		for(String s : arName) {
			System.out.println(s);
		}
		System.out.println("===============");
		
		arName.remove(2);
		
		for(String s : arName) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		arName.set(2,  "원더걸스");
		
		for(String s : arName) {
			System.out.println(s);
		}
		System.out.println("===============");
		if(arName.indexOf("김대중") != -1) {
			System.out.println("있다");
		}
		else {
			System.out.println("없다");
		}
		
		
	}
}
