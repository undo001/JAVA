package generic1;

import java.util.ArrayList;

public class GenericTest0 {

	public static void main(String[] args) {
		// 제네릭 사용 안했을 경우 불편
		ArrayList arNum = new ArrayList();
		arNum.add(1);
//		arNum.add("문자열");

		int value = (int) arNum.get(0);
//		String str = arNum.get(1);
		System.out.println(value);

	}
}
