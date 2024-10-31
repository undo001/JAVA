package objecttest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class getClassTest {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();

		// 클래스의 풀패스(풀네임)
		Class cls = kim.getClass();
		System.out.println(cls.getName());

		System.out.println("-----------------------");
		
		// 클래스의 부모 클래스
//		System.out.println(cls.getSuperclass().getName());
		Class superCls = cls.getSuperclass();
		System.out.println(superCls);
		System.out.println(superCls.getName());
		
		System.out.println("-----------------------");
		
		//필드(멤버변수)
		Field[] fields = cls.getDeclaredFields();
		for(Field f: fields) {
			System.out.println(f.getName());
		}
	
		System.out.println("-----------------------");
		
		//멤버 메서드
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	
	}

}
