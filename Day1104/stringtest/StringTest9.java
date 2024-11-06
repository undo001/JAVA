package stringtest;

public class StringTest9 {
	public static void main(String[] args) {
		//서울, 대전, 대구, 부산
		String str = "서울, 대전, 대구, 부산";
		String[] cities = str.split(",");
		
		for(String s : cities) {
			System.out.println(s);
		}
		//user/data/app/local
		String str2 = "user/data/app/local";
		String[] array = str2.split("/");
		
		for(String s : array) {
			System.out.println(s);
		}
		
		String str3 = String.join("/", "user", "data", "app", "local");
		System.out.println(str3);
	}
}
