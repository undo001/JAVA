package inheritance;

public interface Camera {
	public abstract void takepicture(); // public abstract 생략가능

	default void abc() {
		System.out.println("카메라 abc");
	}
}
