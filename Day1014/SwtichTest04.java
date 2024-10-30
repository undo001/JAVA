import java.util.Scanner;

public class SwtichTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("랭킹: ");
		int rank = sc.nextInt();
		
//		if(rank == 1) {
//			System.out.println("금메달");
//		}
//		else if(rank == 2) {
//			System.out.println("은메달");
//		}
//		else if(rank == 3) {
//			System.out.println("동메달");
//		}
//		else {
//			System.out.println("참가상");
//		}
		
		 switch(rank) {
		 case 1:
		 	System.out.println("대상");
		 	break;
		 case 2:
		 case 3:
		 	System.out.println("우수상");
		 	break;
		 case 4:
		 case 5:
			 System.out.println("장려상");
			 break;
		 }


	sc.close();
	}

}
