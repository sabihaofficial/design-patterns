package factory;

public class AutoFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Auto(3);
    }


}
