package abstractFactory;

public class EconomyVehicleFactory implements VehicleFactory{
	@Override
    public Vehicle createCar() {
        return new EconomyCar();
    }

    @Override
    public Vehicle createBike() {
        return new EconomyBike();
    }
}
