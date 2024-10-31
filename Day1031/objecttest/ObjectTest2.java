package objecttest;

public class ObjectTest2 {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Human lee = new Human(43, "이승우");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "김상형");

		// kim과 lee 비교: 주소값도 다르고 필드값도 다르기 때문에 false
		System.out.println(kim.equals(lee));
		// kim과 kimcopy 비교: 주소값 같고 필드값도 같다
		System.out.println(kim.equals(kimcopy));

		// kim과 kim2 비교: 주소값은 달라고 필드값이 같다
		// 나이와 이름이 같으면 동인인물 => true 출력하기 위해 메서드 재정의(오버라이딩)이 필요해진다
		System.out.println(kim.equals(kim2));
	}

}
