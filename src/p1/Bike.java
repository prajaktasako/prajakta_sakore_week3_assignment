package p1;

public class Bike extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("bike is starting");
		
	}
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		
		Car car = new Car();
		car.start();
		
		Bike bike = new Bike();
		bike.start();
	}

}
