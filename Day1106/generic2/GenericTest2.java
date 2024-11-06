package generic2;

public class GenericTest2 {

	public static void main(String[] args) {
		// 제네릭 intbox, doublebox로 직접 구현해봄 하지만 이렇게 하면 매분 int, double 만들어야해서
		// 한번에 할수 없을까 해서 생긴게 제네릭
		IntBox ib = new IntBox(1234);
		// get() 메서드는 ib의 value 값을 ibv에서 읽을 수 있도록 해주는 역할
		int ibv = ib.get();

		System.out.println(ibv);

		DoubleBox db = new DoubleBox(56.78);
		double dbv = db.get();

		System.out.println(dbv);
	}
}
