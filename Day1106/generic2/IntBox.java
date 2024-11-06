package generic2;

public class IntBox {
	int value;

	public IntBox(int value) {
		this.value = value;
	}

	public int get() {
		return value;
	}

	// 내가 주는 값으로 필드값을 초기화 해라
	public void set(int value) {
		this.value = value;
	}

}
