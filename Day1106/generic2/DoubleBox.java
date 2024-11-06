package generic2;

public class DoubleBox {
	Double value;

	public DoubleBox(double value) {
		this.value = value;
	}

	public double get() {
		return value;
	}

	// 내가 주는 값으로 필드값을 초기화 해라
	public void set(double value) {
		this.value = value;
	}

}
