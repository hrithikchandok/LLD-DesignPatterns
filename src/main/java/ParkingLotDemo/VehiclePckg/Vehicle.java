package ParkingLotDemo.VehiclePckg;

public class Vehicle
{
    String licenceNumber;
    VehicleType vehicleType;

    Vehicle(String licenceNumber, VehicleType vehicleType)
    {
        this.licenceNumber = licenceNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getType()
    {
        return vehicleType;
    }


}
