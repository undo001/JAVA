package exception;

public class ExceptionTest0 {

	public static void main(String[] args) {
		// 10 / 0 의 결과가 예러이지만 우리가 원하는 것은 빨간 예러 글씨가 아닌 프로그램 종료를 뜨게 하고 싶다.
		System.out.println(10 / 0); // 컴파일러가 오류를 못잡는다.

		System.out.println("프로그램 종료");

//		int a = 10;
//		int b = 0;
//		int num;
//		
//		try {
//			num = a / b;
//			System.out.println(num);
//		}
//		catch(java.lang.ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("프로그램 종료");
//			
//		}

	}
}
