package factory;

public class Bus implements IVehicle{
	@Override 
	public String rentVehicle() {
		return  "Bus Has Been Rented Successfully" ;
	}
	@Override
	public String sellVehicle() {
		return  "Bus Has Been Sold Successfully" ;
	}
}
