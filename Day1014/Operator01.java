
public class Operator01 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 6; 
		// +, -
		System.out.println(num1 + num2); // 덧셈
		System.out.println(num1 - num2); // 뺄셈
		// *, /
		System.out.println(num1 * num2); // 곱셈
		System.out.println(num1 / num2); // 나눗셈
		
		// 정수끼리의 연산의 결과는 항상 정수를 반환
		
		// 나머지 연산자 : % (10 /6: 1(몫). 10 % 6: 4
		System.out.println(num1 % num2);
		
		//짝수, 홀수
		System.out.println(num1 % 2 == 0);  //짝수
		System.out.println(num1 % 2 != 0);  //홀수
	}

}
