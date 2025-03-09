package ParkingLotDemo;

import ParkingLotDemo.VehiclePckg.Vehicle;

public class Main {
    public static void main(String[] args){

        ParkingLot pk=ParkingLot.getInstance();
        pk.addSpot();

        VehicleFactory  factory = new VehicleFactory();
        Vehicle vehicle1 = factory.createVehicle("CAR","121");
        System.out.println(vehicle1);
        Vehicle vehicle2 = factory.createVehicle("BIKE","11");
        System.out.println(vehicle2);

        ParkingSpot t1=pk.AssignSpot(vehicle1);
        ParkingSpot t2=pk.AssignSpot(vehicle2);
        t1.removeVehicle(vehicle1);
        t2.removeVehicle(vehicle2);



    }
}
