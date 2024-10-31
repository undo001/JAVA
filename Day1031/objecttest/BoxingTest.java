package objecttest;

import java.net.MulticastSocket;

public class BoxingTest {
		
	public static void main(String[] args) {
//		int i = 1234;
//		String str = i.toString();
//		System.out.println(str);

		int i = 1234;
		Integer wrapint = i;
		String str = wrapint.toString();
		System.out.println(str);
		
		double d = 3.14;
		Double wrapdbl = d;
		String str1 = wrapdbl.toString(); // String 생략 가능
		System.out.println(str1);
		
		
	
	}
}
