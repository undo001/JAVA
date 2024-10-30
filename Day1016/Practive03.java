
public class Practive03 {

	public static void main(String[] args) {

		int i = 0;

		// 정수 중에서 5의 배수이자 7의 배수인 첫 번째 수?
		while (true) {
			i++;
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.print(i);
				break;
			}

		}
		
		System.out.println();
		
		// 정수 중에서 5의 배수이자 7의 배수인 첫 번째 수?
		i = 0;
		
		do {
			i++;
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.print(i);
				break;
			}
			
		}while(true);
		
		System.out.println();

		// 1 ~ 20 중에서 3의 배수는 제외하고 출력하기
		for (i = 1; i <= 20; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1 ~ 20 중에서 3의 배수는 제외하고 출력하기
		i = 0;
		
		while(i <= 20) {
			i++;
			if(i % 3 != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
