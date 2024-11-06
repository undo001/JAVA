package stringtest;

public class StringTest3 {
	public static void main(String[] args) {
		String str = "KOREA";
		String str2 = "korea";

		System.out.println(str.equals(str2) ? "같다" : "다르다");
		System.out.println(str.equalsIgnoreCase(str2) ? "같다" : "다르다");
	}
}
