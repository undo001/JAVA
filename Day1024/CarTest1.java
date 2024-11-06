
public class CarTest1 {
	public static void main(String[] args) {
		Car korando = new Car();

		korando.name = "코란도";
		korando.gasoline = false;
		System.out.print(korando.name + ": ");
		korando.run();

		Car equs = new Car();

		equs.name = "에쿠스";
		equs.gasoline = true;
		System.out.print(equs.name + ": ");
		equs.run();

		System.out.println("korando: " + korando);
		System.out.println("equs: " + equs);
	}
}
