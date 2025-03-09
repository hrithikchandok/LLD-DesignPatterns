package ParkingLotDemo;


import ParkingLotDemo.VehiclePckg.Bike;
import ParkingLotDemo.VehiclePckg.Car;
import ParkingLotDemo.VehiclePckg.Truck;
import ParkingLotDemo.VehiclePckg.Vehicle;

public class VehicleFactory {
        public static Vehicle createVehicle(String type, String licensePlate) {
            switch(type.toLowerCase()) {
                case "car":
                    return new Car(licensePlate);
                case "bike":
                    return new Bike(licensePlate);
                case "truck":
                    return new Truck(licensePlate);
                default:
                    throw new IllegalArgumentException("Unknown vehicle type");
            }
        }
}
