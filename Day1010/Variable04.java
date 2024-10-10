
public class Variable04 {
	
	public static void main(String[] args) {
		//진위형
		
		boolean b = true;
		System.out.println(b);
		int age=15;
		
		while(age <27) {
			
			if(age > 19) {
				//조건식이 true일때 실행 될 코드
				System.out.println(age);
			}
			else
				System.out.println("성인이 아닙니다");
			age +=1;
		}
		
		
		System.out.println("프로그램 종료");
	}
	
}
