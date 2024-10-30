
public class iftest03 {
	public static void main(String[] args) {
		int age = 9;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		}
		else if(age > 12) {
			System.out.println("청소년입니다.");
		}
		else {
			if (age >= 10) {
				System.out.println("초등학생입니다.");
			}
			else {
				System.out.println("어린이입니다.");	
			}
			
		}
			
		
	}
}
