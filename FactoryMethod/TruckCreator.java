package factory;

public class TruckCreator extends VehicleCreator{
	@Override
	public IVehicle createVehicle() {
		return new Truck() ;
	}
}
