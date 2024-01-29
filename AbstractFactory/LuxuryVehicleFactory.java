package abstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new LuxuryCar();
    }

    @Override
    public Vehicle createBike() {
        return new LuxuryBike();
    }
}
