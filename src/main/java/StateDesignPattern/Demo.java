package StateDesignPattern;

public class Demo {
    public static void main(String[] args){
         TrafficLight t1=new TrafficLight();

         for(int i=0;i<6;i++)
         t1.change(new RedLightState());
    }
}
