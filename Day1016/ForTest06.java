import java.util.Scanner;

public class ForTest06 {
    public static void main(String[] args) {
//        // 구구단
//        Scanner sc = new Scanner(System.in);
//        System.out.print("단을 입력하세요: ");
//        int dan = sc.nextInt();
//        int i = 0;
//        int x = 0;
//        
//        for(i = 1; i <= 9; i++) {
//        	x = dan*i;
//        	System.out.println(dan + " X " +  i + " = " + x);
//        }

    	
    	int dan = 0;
    	int i = 0;
    	
    	for(dan = 2; dan <= 10; dan++) {
    		for(i = 1; i <=9; i++) {
    			System.out.println(dan + " X " +  i + " = " + (dan*i));
    		}
    		System.out.println("===========");
    	}
    	
    }
    
}