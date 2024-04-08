
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		
		Car car = new Car("Dodge");
		Car car2 = new Car("Ford");
		
		garage.park(car);
		garage.park(car2);
	}

}
