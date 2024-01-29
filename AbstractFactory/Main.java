package abstractFactory;

public class Main {

	public static void main(String[] args) {
		VehicleFactory economyVehicleFactory = new EconomyVehicleFactory();
		VehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
		
		Vehicle economyCar = economyVehicleFactory.createCar() ;
		Vehicle luxuryBike = luxuryVehicleFactory.createBike() ;
		
		economyCar.display() ;
		luxuryBike.display();
	}

}
/*Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.*/
/*
	Ex : Rent Vehicle service has the following services
 		Rent and Sell Bikes and Cars 
*/
