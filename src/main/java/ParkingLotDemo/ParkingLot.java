package ParkingLotDemo;

import ParkingLotDemo.VehiclePckg.Vehicle;

import java.util.ArrayList;
import java.util.List;
//singleton class
public class ParkingLot {

   private static ParkingLot instance = null;
   List<ParkingSpot>li=new ArrayList<>();


   private ParkingLot()
   {

   }
   void addSpot(){
       li.add(new ParkingSpot(null,null,true));
       li.add(new ParkingSpot(null,null,true));
       li.add(new ParkingSpot(null,null,true));
       li.add(new ParkingSpot(null,null,true));

   }
    public static synchronized ParkingLot getInstance() {

       if(instance == null) {

              instance=new ParkingLot();
       }
        return instance;
    }

    ParkingSpot AssignSpot(Vehicle vehicle)
    {
        for(ParkingSpot sp:li)
        {
            if(sp.isAvailable==true)
            {
               return  sp.assignVehcile(vehicle);
            }
        }
        return null;
    }


}
