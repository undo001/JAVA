package generic3;

// 제네릭 클래스 완성
public class Box<A> {
	A value;

	public Box(A value) {
		this.value = value;
	}

	public A get() {
		return value;
	}

	public void set(A value) {
		this.value = value;
	}

}
