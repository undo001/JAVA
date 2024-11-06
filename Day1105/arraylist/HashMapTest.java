package arraylist;

import java.util.*;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map<String, Integer> snack = new HashMap<>();
		snack.put("오징어땅콩", 2500);
		snack.put("죠리퐁", 1000);
		snack.put("핫브레이크", 450);
		snack.put("빼빼로", 900);
		
		//get(key); => value를 리턴
		System.out.println("가격: " + snack.get("오징어땅콩"));
	}
}
