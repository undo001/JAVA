package arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinekdListTest2 {

	public static void main(String[] args) {
		List<String> arName = new LinkedList<>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1, "노태우");

		//반복자를 이용한 루프
		Iterator<String> it = arName.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
