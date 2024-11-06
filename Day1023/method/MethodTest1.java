package method;

import java.time.LocalDate;

public class MethodTest1 {

	public static void main(String[] args) {
		//오늘 날짜 구하기
		
		System.out.println("오늘은 " + getDate() + "일 입니다.");
	}
	
	static int getDate() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
	
	
}
