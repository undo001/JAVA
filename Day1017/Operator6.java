
public class Operator6 {
	public static void main(String[] args) {
		//논리연산자
		// AND: &&
		int num = 10;
		if(num < 5 && num++ > 8) {
			System.out.println("맞다");
		}
		System.out.println(num);
		// 조건식1 && 조건식 2
		//	T 	:	T	=> T
		//	F	:	T	=> F
		//	T	:	F	=> F
		//	F	:	F	=> F
		// OR: ||
		if(num < 5 || num++ > 8) {
			System.out.println("맞다");
		}
		// NOT: !
		if(!(num > 5)) {
			System.out.println(true);
		}
	}
}
