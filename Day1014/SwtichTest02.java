import java.util.Scanner;

public class SwtichTest02 {

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
		 	System.out.println("금메달");
		 	break;
		 case 2:
		 	System.out.println("은메달");
		 	break;
		 case 3:
		 	System.out.println("동메달");
		 	break;
		 default:
		 	System.out.println("참가상");
		 }


	sc.close();
	}

}
