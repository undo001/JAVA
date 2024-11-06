package generic4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest6 {
	public static void main(String[] args) {
		List<String> yoil = new ArrayList<>();
		yoil.add("일요일");
		yoil.add("월요일");
		GenericTest6.<String>dumpArray(yoil);
		dumpArray(yoil);

		List<Integer> score = new LinkedList<>();
		score.add(98);
		score.add(72);
		GenericTest6.<Integer>dumpArray(score);
		dumpArray(score);

	}

	static <T> void dumpArray(List<T> ar) {
		for (T t : ar) {
			System.out.println(t);
		}
	}
}
