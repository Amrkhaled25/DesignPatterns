package factory;

public class Car implements IVehicle{
	@Override 
	public String rentVehicle() {
		return  "Car Has Been Rented Successfully" ;
	}
	@Override
	public String sellVehicle() {
		return  "Car Has Been Sold Successfully" ;
	}
}
