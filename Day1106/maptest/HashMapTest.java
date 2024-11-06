package maptest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Human, Integer> donate = new HashMap<>();

		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "벅수현"), 5000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금: " + donate.get(park));
		// 다시
	}
}
