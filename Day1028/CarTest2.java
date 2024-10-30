
public class CarTest2 {
	public static void main(String[] args) {
		Car.printNum();
		Car korando = new Car("코란도", false);
		
		Car pride = new Car("프라이드", true);
		Car.printNum();
		
		//차 출고대수 촉화
		Car.resetNum();
		
		Car equus = new Car("애쿠스", true);
		Car.printNum();
	}
}
