package inheritance;

public interface Mp3 {
	void play();

	default void abc() {
		System.out.println("Mp3 abc");
	}
}
