package StateDesignPattern;

public class RedLightState implements TrafficLightState{
    @Override
    public void change(TrafficLight context) {
        System.out.println("red light");
        context.change(new YellowLightState());

    }
}
