package generic2;

public class GenericTest3 {

	public static void main(String[] args) {
		ObjectBox ib = new ObjectBox(1234);
		// objectbox 클래스가 제네릭 타입을 사용하지 않고 object타입을 사용하기 때문에
		// 또한 저장된 데이터의 타입을 명확하게 관리하고 타입 안정성을 확보하기 위해 제네릭을 사용하는 것
		int ibv = (int) ib.get();

		System.out.println(ibv);

		ObjectBox db = new ObjectBox(56.78);
		double dbv = (double) db.get();

		System.out.println(dbv);
	}
}
