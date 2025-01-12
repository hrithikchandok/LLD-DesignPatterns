package FascadeDesignPattern;

import java.util.HashMap;

class Pair{
    boolean avilable;
    int price;
    Pair(boolean key, int price){
        this.avilable = key;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + avilable +
                ", price=" + price +
                '}';
    }
}
public class MovieSystem {
    HashMap<String,Pair>mp=new HashMap<>();
    public MovieSystem(){
        mp.put("stree",new Pair(true,200));
        mp.put("stree2",new Pair(true,250));
        mp.put("BhoolBhuliya3",new Pair(true,300));
    }
    public boolean isAvailable(String movie){
         if(mp.containsKey(movie)){
              if(mp.get(movie).avilable){
                  return true;
              }
         }
         else
         {
             System.out.println("Movie not on Treather");
         }
         return false;
    }

}
