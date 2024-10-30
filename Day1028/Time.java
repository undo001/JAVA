
public class Time {
	
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	//getter : 외부에서 값을 가져오고 싶을 때
	public int getHour() {
		return hour;
	}
	
	//setter : 외부에서 준 값으로 필드를 세팅할 때
	public void setHour(int hour) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
	}
	
	// boolean 이므로 true, false 이므로 나머지 는 get으로 시작하나 boolean만 is로 시작
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		else {
			//유효하지 않은 값
			this.minute = -99;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	void whatTime() {
		System.out.print(am ? "오전 " : "오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
}
