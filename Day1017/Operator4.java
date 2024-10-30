
public class Operator4 {
	public static void main(String[] args) {
		System.out.println(4 + 5);
		System.out.println("영구와 " + "땡칠이");
		// 문자열과 정수 연결 : "응답하라 1988"
		System.out.println("응답하라 " + 1988 + 1);
		// 정수와 문자열 연결 : "1988 응답하라"
		System.out.println(1 + 1988 + "응답하라");
		//"1" + 1988
		System.out.println("" + 1 + 1988 + "응답하라");
		
		//부호연산자 : 양수, 음수
		int num = -10;
		System.out.println(-num);
		System.out.println(num);
		num = -num;
		System.out.println(num);
		
	}
}
