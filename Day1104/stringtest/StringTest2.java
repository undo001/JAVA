package stringtest;

public class StringTest2 {
	public static void main(String[] args) {
		String str = "아름다운 우리나라";
		System.out.println("길이(몇글자?): " + str.length());
		// str.length() == 0
		System.out.println("비였나? " + str.isEmpty());

		// 기본 생성자로 생성했을 때
		String str0 = new String();
		System.out.println(str0);
		System.out.println(str0.length());
		System.out.println(str0.isEmpty());
		System.out.println(str0.isBlank());
		System.out.println("=======================");
		
		// 빈 문자열
		String str2 = "";
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		System.out.println("=======================");
		
		//공백 하나
		String str3 = " ";
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		System.out.println("=======================");
		
		//null
		String str4 = null;
		System.out.println(str4);
//		System.out.println(str4.length());
//		System.out.println(str4.isEmpty());
//		System.out.println(str4.isBlank());
		System.out.println("=======================");

	}
}
