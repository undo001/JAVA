import java.util.Scanner;

public class Ifelse6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a>=b) {
			if(a>=c) {
				System.out.println(a);
			}
			else{
				System.out.println(c);
			}
		}
		
		else if(b>=a) {
			if(b>=c) {
				System.out.println(b);
			}
			else
				System.out.println(c);
			}
		sc.close();
		
		}		
		
	}

