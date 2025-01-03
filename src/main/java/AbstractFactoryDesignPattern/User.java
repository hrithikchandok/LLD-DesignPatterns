package AbstractFactoryDesignPattern;
// product A
interface sedan{
     void assemble();
}
// product B
interface suv{
     void assemble();
}

// Concerete classes for Produts
class Toyatasedan implements sedan{
    @Override
    public void assemble() {
         System.out.println("Toyatasedan");
    }
}
class Toyatasuv implements suv{
    @Override
    public void assemble() {
           System.out.println("Toyatasuv");
    }
}
class Hyundaisedan implements sedan{
    @Override
    public void assemble() {
         System.out.println("Hyundaisedan");
    }
}
class Hyundaisuv implements suv{
    @Override
    public void assemble() {
         System.out.println("Hyundaisuv");
    }
}
interface Carfactory{
    sedan sedanCars();
    suv suvCars();
}
class ToyatataFactory implements Carfactory {

    @Override
    public sedan sedanCars() {
        return new Toyatasedan();
    }

    @Override
    public suv suvCars() {
        return new Toyatasuv();
    }
}
class HyundaiFactory implements Carfactory {
    @Override
    public sedan sedanCars() {
        return new Hyundaisedan();
    }

    @Override
    public suv suvCars() {
        return new Hyundaisuv();
    }
}



class Client{
    sedan sedan;
    suv suv;

    Client(Carfactory carfactory)
    {
        sedan = carfactory.sedanCars();
        suv = carfactory.suvCars();
    }

    void getassemble()
    {
        sedan.assemble();
        suv.assemble();
    }



}
public class User {
    public static void main(String[] args){

        Client cl=new Client(new ToyatataFactory());
        cl.getassemble();
    }
}
//When to Use the Abstract Factory Pattern
//Families of Related Objects:
//
//When you need to create families of related objects (e.g., sedan and suv) that share a common theme or functionality.
//Decoupling Object Creation:
//
//When you want to isolate the client from the details of how the objects are created.
//Consistency Across Families:
//
//When you need to ensure that objects from the same family are used together. For example, you don't want a Toyota sedan paired with a Hyundai SUV.
//Easily Extendable:
//
//When you foresee the need to add new families of objects (e.g., a new brand of cars) without modifying existing code.
