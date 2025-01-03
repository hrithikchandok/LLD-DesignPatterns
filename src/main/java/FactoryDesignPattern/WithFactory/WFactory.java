package FactoryDesignPattern.WithFactory;

interface Vehicle
{
    void printVehicle();
}
class TwoWheeler implements Vehicle
{
    @Override
    public void printVehicle() {
        System.out.println("TwoWheeler");
    }
}
class FourWheeler implements Vehicle
{
    @Override
    public void printVehicle() {
        System.out.println("FourWheeler");
    }
}
interface VehicleFactory {
    Vehicle createVehicle();
}
class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}


class Client{
    private Vehicle vehicle;
    Vehicle getVehicle(VehicleFactory vehiclefactory)
    {
        vehicle= vehiclefactory.createVehicle();
        return vehicle;
    }
    void cleanUp()
    {
        vehicle = null;
    }
}
//user
public class WFactory {
    public static void main(String[] args)
    {
       Client client = new Client();
        Vehicle vehicle = client.getVehicle(new TwoWheelerFactory());
        vehicle.printVehicle();
    }
}
// Advantage of this
// In this I can add new Type of vehicle without any change in Client Class
// We have decoupled the code for object creation
