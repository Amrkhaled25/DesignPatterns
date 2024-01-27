package factory;

public class BusCreator extends VehicleCreator {
	@Override
	public IVehicle createVehicle() {
		return new Bus() ;
	}
}
