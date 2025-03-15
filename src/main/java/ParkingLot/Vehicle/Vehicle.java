package ParkingLot.Vehicle;

public class Vehicle
{
    int vehicle_id;
    String license_number;
    String name;
    void details()
    {
        System.out.println("Details of Vehicle");
    }

    public Vehicle getVehcile(String nam)
    {
        name=name.toLowerCase();
        if(name=="car")
            return new Car();
        else if(name=="bike")
            return new Bike();
        return null;
    }
}
