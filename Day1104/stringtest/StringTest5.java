package stringtest;

public class StringTest5 {
	public static void main(String[] args) {
		String[] files = { "girl.jpg", "boy.png", "child.avi", "school.jpg", "book.gif" };

		// 확장자가 jpg인 파일
		for (String s : files) {
			if (s.endsWith(".jpg")) {
				System.out.println(s);
			}

		}
	}
}
