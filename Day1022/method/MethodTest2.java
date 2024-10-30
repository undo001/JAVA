package method;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
			// 연도와 월을 입력 받아서 며칠가지 있나
		Scanner sc = new Scanner(System.in);
		System.out.print("몇년? ");
		int year = sc.nextInt();
		System.out.print("몇월? ");
		int month = sc.nextInt();
		
		int days = getMonthDays(year, month);
		System.out.println(year + "년" + month + "월은 " + days + "일까지");
		
		
	}	
	
	static int getMonthDays(int year, int month) {
		int[] arDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return 29;
		}
		return arDays[month];
		
	}
	
}
