package generic3;

public class GenericTest4 {

	public static void main(String[] args) {
		// 앞에 <Integer> 로 명시했기 때문에 뒤에 <>이렇게 안에 내용은 생략 가능
		Box<Integer> ib = new Box<>(1234);
		int ibv = (int) ib.get();

		System.out.println(ibv);

		Box<Double> db = new Box<>(56.78);
		double dbv = (double) db.get();

		System.out.println(dbv);

		System.out.println(ib.getClass());
		System.out.println(db.getClass());

//		Box test = new Box(33);
//		Object object = test.get();
	}
}
