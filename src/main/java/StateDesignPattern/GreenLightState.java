package StateDesignPattern;

public class GreenLightState implements TrafficLightState
{
    @Override
    public void change(TrafficLight context) {
        System.out.println("Green light");
//        context.change(new RedLightState());

    }
}
