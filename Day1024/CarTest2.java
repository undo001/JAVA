
public class CarTest2 {
	public static void main(String[] args) {
		// 사용자정의 함수
		Car korando = new Car("코란도", false);

		System.out.print("main에서 korando의 주소" + korando);
		korando.run();

//		Car equs = new Car();
//
//		equs.name = "에쿠스";
//		equs.gasoline = true;
//		System.out.print(equs.name + ": ");
//		equs.run();
//
//		System.out.println("korando: " + korando);
//		System.out.println("equs: " + equs);
	}
}
