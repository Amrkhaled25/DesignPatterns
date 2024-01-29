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
