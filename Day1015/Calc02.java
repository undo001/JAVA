import java.util.Scanner;

public class Calc02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자를 입력하세요(+, -, *, /): ");
		String a = sc.next();
		
		System.out.println("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수: ");
		int num2 = sc.nextInt();	
		
		int result = 0;
		
		if(num1 != 0 && num2 != 0) {
			switch(a){
			case "+" :
				result = num1 + num2;
				System.out.println(result);
			break;
			case "-" :
				result = num1 - num2;
				System.out.println(num1 - num2);
			break;
			case "*" :
				result = num1 * num2;
				System.out.println(num1 * num2);
				break;
			case "/" :
				result = num1 / num2;
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("잘못된 연산자");
			}
		}
		else {
			System.out.println("오류");
		}
		
		sc.close();
	}

}
