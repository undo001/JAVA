import java.util.Scanner;

public class ForTest07 {
    public static void main(String[] args) {
        // 구구단
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        
        while(true) {
        	System.out.print("학년(1~6): ");
            grade = sc.nextInt();
            if(grade >= 1 && grade <= 6) {
            	//제대로 입력
;            	break;
            }
            
            System.out.println("다시 입력해라");
        }
        System.out.println(grade + "학년 입니다.");
        
        sc.close();
    }
    
}