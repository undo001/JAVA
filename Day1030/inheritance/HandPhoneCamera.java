package inheritance;

public class HandPhoneCamera extends HandPhone implements Camera, Mp3 {

	@Override
	public void takepicture() {
		System.out.println("사진을 찍는다.");
	}

	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		Mp3.super.abc();
	}

}
