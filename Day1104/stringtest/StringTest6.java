package stringtest;

public class StringTest6 {
	public static void main(String[] args) {
		String str = "Korea";

		// 대문자
		System.out.println(str.toUpperCase());
//		System.out.println(str);
//		
//		//대문자로 변환
//		str = str.toUpperCase();
//		System.out.println(str);

		// 소문자
		System.out.println(str.toLowerCase());

		// 앞 뒤 공백 제거
		str = "     Republic Of KOREA                  ";
		System.out.println(str.trim());
	}
}
