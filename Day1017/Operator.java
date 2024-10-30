
public class Operator {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num + 1);
		System.out.println(num);

		num += 1;
		System.out.println(num);
		
		// 출력 후 증가
		System.out.println(num++);
		
		// 출력
		System.out.println(num);
		
		// 증가 후 출력
		System.out.println(++num);
	}
}
