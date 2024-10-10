
public class StringTest2 {
	
	public static void main(String[] args) {
		//텍스트 블록
		/*
		 * 안녕하세요.
		 * 반갑습니다.
		 */
		String str = "안녕하세요.\n반갑습니다.";
		System.out.println(str);
		
		//텍스트 블록
		String str2 = """
				
				안녕하세요.
				반갑습니다.
				'한글' "세종대방"
						""";
		System.out.println(str2);
	}
}
