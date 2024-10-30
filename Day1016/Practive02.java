
public class Practive02 {

	public static void main(String[] args) {
		int i = 0;
		
		// 10 20 30 40 50 60 70 80 90 100
		for(i = 10; i <= 100; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5 4 3 2 1
		for(i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 10000 1000 100 10 1
		for(i = 10000; i > 0; i /= 10) {
			System.out.print(i + " ");
		}
		
	}
	

}
