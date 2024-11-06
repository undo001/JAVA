package generic2;

public class ObjectBox {
	Object value;

	public ObjectBox(Object value) {
		this.value = value;
	}

	public Object get() {
		return value;
	}

	// 내가 주는 값으로 필드값을 초기int ibv = (int)ib.get();화 해라
	public void set(Object value) {
		this.value = value;
	}

}
