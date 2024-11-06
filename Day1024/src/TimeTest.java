import java.time.LocalDateTime;

public class TimeTest {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);

		// 시
		System.out.println(today.getHour());

		// 분
		System.out.println(today.getMinute());

		// 초
		System.out.println(today.getSecond());
			
		
		Time time = new Time(34, 77, 97);
		time.whatTime();
	}

}
