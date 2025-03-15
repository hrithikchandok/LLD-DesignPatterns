package ParkingLot.Vehicle;

public class VehicleFactory
{
    String name;
    Vehicle vehicle;
    VehicleFactory(String name)
    {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle.getVehcile(name);
    }
}
