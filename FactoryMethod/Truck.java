package factory;

public class Truck implements IVehicle{
	@Override 
	public String rentVehicle() {
		return  "Truck Has Been Rented Successfully" ;
	}
	@Override
	public String sellVehicle() {
		return  "Truck Has Been Sold Successfully" ;
	}
}
