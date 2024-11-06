package objecttest;

public class TimeTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// 작업
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum += i;
			System.out.println(sum);
		}
		System.out.println("결과: " + sum);

		long end = System.currentTimeMillis();

		//작업 경과 시간
		System.out.println((end - start)/1000.0 +"초 걸림");
	
	}
}
