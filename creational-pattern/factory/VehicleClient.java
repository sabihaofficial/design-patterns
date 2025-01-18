package factory;

public class VehicleClient {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory autoFactory = new AutoFactory();
        Vehicle auto = autoFactory.createVehicle();
        auto.drive();
    }
}
