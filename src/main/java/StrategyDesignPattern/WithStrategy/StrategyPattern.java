package StrategyDesignPattern.WithStrategy;

interface driveStrategy {
    void Drive();
}
class SportyDriveStrategy implements driveStrategy {
    public void Drive() {
        System.out.println("Sporty Drive");
    }
}
class NormalDriveStrategy implements driveStrategy {

    public void Drive() {
        System.out.println("Normal Drive");

    }
}
class Vehicle {
    private driveStrategy strategy;
    public Vehicle(driveStrategy strategy) {
        this.strategy = strategy;
    }
    public void DrivePrint() {
        strategy.Drive();
    }
}
class NormalVehicle extends Vehicle {
    public NormalVehicle(driveStrategy strategy) {
        super(strategy);
    }
}
class SportyVehicle extends Vehicle {
    public SportyVehicle(driveStrategy strategy) {
        super(strategy);
    }
}
public class StrategyPattern {
    public static void main(String[] args){
          Vehicle vehicle = new SportyVehicle(new NormalDriveStrategy());
          vehicle.DrivePrint();
          Vehicle vehicle2 = new SportyVehicle(new SportyDriveStrategy());
          vehicle2.DrivePrint();

    }
}
