package ParkingLotDemo;

import ParkingLotDemo.VehiclePckg.Vehicle;
import ParkingLotDemo.VehiclePckg.VehicleType;

import java.util.Date;

public class ParkingSpot
{
    Vehicle vehicle;
    VehicleType vehicleType;
    boolean isAvailable;
    Ticket ticket;

    public ParkingSpot(VehicleType vehicleType, Vehicle vehicle, boolean isAvailable) {
        this.vehicleType = vehicleType;

        this.vehicle = vehicle;
        this.isAvailable = isAvailable;
    }

    boolean check()
    {
        return isAvailable==true;
    }

    ParkingSpot assignVehcile(Vehicle vehicle)
    {
         this.vehicle = vehicle;
         this.vehicleType=vehicle.getType();
         isAvailable=false;
         ticket=new Ticket(new Date(),1,this,this.vehicle);
        return this;
    }
    void removeVehicle(Vehicle vehicle)
    {
          this.vehicle=null;
          this.vehicleType=null;
          isAvailable=true;

          System.out.println(this.ticket.calculateFee());
    }
}
