package maptest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> kangwon = new HashSet<String>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");

//		for(String s : kangwon) {
//			System.out.println(s);
//		}

		Iterator<String> iter = kangwon.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}
}
