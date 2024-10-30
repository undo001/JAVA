
public class Casting1 {

	public static void main(String[] args) {
		// 문자열 <-> 숫자
		String str = "123";
		//문자열 -> 숫자 : 적어도 ""안에 숫자여야 한다.
		int value = Integer.parseInt(str);
		
		System.out.println(str + 1);	// 숫자를 더하면 문자열이면 이어붙고
		System.out.println(value + 1);	// 숫자라면 더할 것이다.
		
		//숫자 -> 문자열
		str = String.valueOf(value);
		System.out.println(str + 1);
		
		//단항 연산자는 단독으로 쓰면 전항 후항 둘 다 같은 결과
		++value;
		System.out.println(value);
	}

}
