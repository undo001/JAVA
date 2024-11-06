package stringtest;

public class StringTest8 {
	public static void main(String[] args) {
		String str = "0123456789";
		// substring(n) :n번 인덱스 포함 문자열 끝까지 추출
		System.out.println(str.substring(5));

		// substring(n1, n2) :n1번 인덱스 포함 n2번 인덱스 이전까지 추출
		System.out.println(str.substring(6, 8));
		
		String str2 = str;
		
		str2 += "101112";
		
		System.out.println(str);
		System.out.println(str2);

	}
}
