import java.util.Scanner;

public class inputTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = sc.next();
		System.out.println("입력한이름: " + name);
		
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		System.out.println("입력한나이: " + age + "살");
		
//		String userID = "abc123";  // 카멜표기법
		String user_id = "abc123"; // 뱀표기법
		
		System.out.println(user_id);
		
		sc.close();
	}
	
	
}
