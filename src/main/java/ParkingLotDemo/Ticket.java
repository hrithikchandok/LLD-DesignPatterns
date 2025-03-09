package ParkingLotDemo;

import ParkingLotDemo.VehiclePckg.Vehicle;
import ParkingLotDemo.VehiclePckg.VehicleType;

import java.util.Date;
interface FeeStategy{
     static int  calculateFee1(Date startDate, Date endDate) {
         return 0;
     }
}
class DiscountFee implements FeeStategy {
    public static int calculateFee1(Date startDate, Date endDate) {
//        return endDate-startDate;
          return 9;
    }

}
class DefaultStrategy implements FeeStategy{
    public static int calculateFee1(Date startDate, Date endDate) {
//        String i = endDate - startDate;
//        return i.length();
        return 0;
    }
}
public class Ticket {
    int ticketID;
    Date EntryTime;
    Date ExitTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    FeeStategy feeStrategy;

    public Ticket( Date entryTime, int ticketID, ParkingSpot parkingSpot, Vehicle vehicle) {
        EntryTime = entryTime;
        this.ticketID = ticketID;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    int calculateFee()
    {
        if(vehicle.getType()== VehicleType.CAR)
            return DiscountFee.calculateFee1(EntryTime,new Date());
        else
           return DefaultStrategy.calculateFee1(EntryTime,new Date());


    }

}
