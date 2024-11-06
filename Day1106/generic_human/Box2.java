package generic_human;

// Human고 자식 들만 box2를 사용할 수 있또록 제한한다.
public class Box2<T extends Human> {
	T value;

	public Box2(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	public void set(T value) {
		this.value = value;
	}

	public void intro() {
		value.intro();
	}

}
