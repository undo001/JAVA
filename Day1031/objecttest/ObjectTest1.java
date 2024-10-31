package objecttest;

public class ObjectTest1 {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		System.out.println(kim.toString()); // toString() 생략 가능 - 참조일 경우

		Human lee = new Human(42, "이승우");
		System.out.println(lee);

		int i = 1234;
		System.out.println(i);
		
		String str = new String("대한민국");
		String str2 = new String("대한민국");
		System.out.println(str.equals(str2));
		System.out.println(str);
		System.out.println(str == str2); // 주소가 다르므로 false가 출력
		
		//********************** 주의 **********************//
		// 일반적인 String인 경우 .equals()쓰면 String안에 들어가 있는 문자열이 같을 경우 true 가 나오고
		// class 객체 생성했을 경우 .equals()쓰면 필드 값이 같더라도 참고된 주소가 같을 경우 true가 나온다.
		//************************************************//
		
	}

}
