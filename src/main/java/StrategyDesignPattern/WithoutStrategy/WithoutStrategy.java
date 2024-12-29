package StrategyDesignPattern.WithoutStrategy;

class Vehicle
{
    void drive(){
        System.out.println("Normal Drive class");
    }
}
class SportVehicle extends Vehicle
{
    @Override
    void drive(){
        System.out.println("Sporty Drive "); // repeation of code hogya hai
         }
}
class NormalVehicle extends Vehicle {}

class SuvVehicle extends Vehicle
{ @Override
    void drive(){System.out.println("Sporty Drive "); // we are not able to reuse
                }
}

class Bicycle extends Vehicle{}

public class WithoutStrategy
{
    public static void main(String[] args){
        Vehicle v = new NormalVehicle();

    }
}
