package generic1;

import java.util.ArrayList;

public class GenericTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<>();
		arNum.add(1);
//		arNum.add("문자열");
//		arNu.add 처보면 자동으로 integer 뜸

		int value = arNum.get(0);
//		String str = arNum.get(1);
		System.out.println(value);

	}
}
