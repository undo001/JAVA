
public class Casting1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		int i = b + s;

		System.out.println(i);
		
		i = 1;
		float f = 3.14f;
		double d = i + f;
		
		System.out.println(d);
		// 형변환
		// 정수: byte(1), short(2), int(4), long(8)
		// byte -> short -> int -> long
		// 화살표 방향으로는 자동변환 가능
		
		// 정수와 실수
		// 정수: 덜 정밀한 타입
		// 실수: 더 정밀한 타입
		// 자동 형변환: 정수형 -> 실수형, 반대 X
		// 정수를 실수로
		int i2 = 10;
		double d2 = i2;
		System.out.println(d2);
		
		// 실수형을 정수형 변수에 대입 => X
		// 자동형변환은 불가능하지만 강제형변환은 가능
		int i3 = (int)d2;
		System.out.println(i3);
		
		// 강제형변환 (내가 변환하고 싶은 데이터 타입)
		//: 위험감수하고도 변호나을 해야 할때
		i3 = (int)3.14; //데이터 손실
		System.out.println(i3);
		
		byte b3 = (byte)i3;
		System.out.println(b3);
		
		int i4 = 300;
		b3 = (byte)i4;
		System.out.println(b3);
		
	}
}
