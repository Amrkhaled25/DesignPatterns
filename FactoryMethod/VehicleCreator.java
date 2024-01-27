package factory;

public abstract class VehicleCreator {
	IVehicle vehicleObj = createVehicle()  ;
	public String rentVehicleMethod() {
		return vehicleObj.rentVehicle() ;
	}
	public String sellVehicleMethod() {
		return vehicleObj.sellVehicle() ;
	}
	
	public abstract IVehicle createVehicle() ;
}
