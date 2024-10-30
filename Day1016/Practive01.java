
public class Practive01 {
		
	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9
		int i = 0;
		for(i = 0; i <= 9; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 2 3 4 5 6 7 8 9 10
		i = 0;
		while(i < 10) {
			i++;
			System.out.print(i + " ");
			
		}
		System.out.println();

		// 1 3 5 7 9
		i = 1;	
		do {
			System.out.print(i + " ");
			i += 2;
		}while(i <= 9);
		System.out.println();
		
		// 2 4 6 8 10
		for(i = 2; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		
	}	

}
