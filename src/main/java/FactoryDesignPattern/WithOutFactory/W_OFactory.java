package FactoryDesignPattern.WithOutFactory;
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
class Client{
    private Vehicle vehicle;

    Vehicle getVehicle(String type)
    {
        if(type.equals("TwoWheeler"))
            return new TwoWheeler();
        else
            return new FourWheeler();
    }

    void cleanUp()
    {
        vehicle = null;
    }



}
public class W_OFactory {
    public static void main(String[] args){
       Vehicle Obj = new Client().getVehicle("FourWheeler");
       Obj.printVehicle();

        Vehicle Obj2 = new Client().getVehicle("TwoWheeler");
        Obj2.printVehicle();

    }
}

/// Disadvantages of above code is Its not following solid Princliples
/// if i want to add new Vehicle -> change in client class is must (open for extension closed for modificatgion voilated)
/// client class more than one responsiblity (creation of object , cleanup etc)


