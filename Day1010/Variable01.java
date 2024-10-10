
public class Variable01 {
	
	public static void main(String[] args) {
		byte b1 = 1;
		byte b2 = 2;
		
//		byte b3 = b1 + b3; byte, short 끼리 연산 불가, int로 자동변환 후 연산
		
		int b3 = (int)b1;
		int b4 = (int)b2; // 형 변환 코드
		
		int b5 = b3 + b4;
		System.out.println(b5);
		
		
	}
}
