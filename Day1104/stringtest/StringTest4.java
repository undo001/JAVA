package stringtest;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "String Search Method of String Class";

		// 앞에서 부터 검색 시장: 해당 인덱스 반환
		System.out.println("앞쪽 t: " + str.indexOf('t'));

		// 뒤에서 부터 검색 시장: 해당 인덱스 반환
		System.out.println("뒤쪽 t: " + str.lastIndexOf('t'));

		// 없는 문자를 찾아라 했을 때
		System.out.println("앞쪽 z: " + str.lastIndexOf('z'));

		// 찾은 문자열의 시작 인덱스
		System.out.println("앞쪽 String: " + str.indexOf("String"));
		System.out.println("앞쪽 String: " + str.lastIndexOf("String"));

	}
}
