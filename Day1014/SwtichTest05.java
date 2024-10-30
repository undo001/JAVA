import java.util.Scanner;

public class SwtichTest05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수: ");
		int score = sc.nextInt();
		
		//90 ~ 100 : A
		if(score >= 90) {
			System.out.println("A");
		}
		//80 ~ 89 : B
		else if(score >= 80) {
			System.out.println("B");
		}
		//70 ~ 79 : B
		else if(score >= 70) {
			System.out.println("C");
		}
		//60 ~ 69 : B
		else if(score >= 60) {
			System.out.println("D");
		}
		
		
	sc.close();
	}

}
