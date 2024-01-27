package factory;

public class CarCreator extends VehicleCreator{
	@Override
	public IVehicle createVehicle() {
		return new Car() ;
	}
}
