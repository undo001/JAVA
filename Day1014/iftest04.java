
public class iftest04 {
	public static void main(String[] args) {
		int age = 25;
		boolean man = true;
		
		
		if(age >= 19) {
			if(man) {
				System.out.println("성인남성: 25,000");
			}
			else {
				System.out.println("성인여행: 21,000");
			}
		}
		else {
			System.out.println("청소년: 15,000");
		}
			
		
	}
}
