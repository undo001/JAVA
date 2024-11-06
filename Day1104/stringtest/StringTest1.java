package stringtest;

public class StringTest1 {
	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		
		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = {'k', 'o', 'r', 'e', 'a'};
		String str3 = new String(ar); //"korea"
		System.out.println(str3);
		
		//배열이 가지고 있는 length는 변수: 길이값
		System.out.println(ar.length);
		//String이 가지고 있는 length()는 메서드: 몇글자?
		System.out.println(str3.length());
		
	}
}
