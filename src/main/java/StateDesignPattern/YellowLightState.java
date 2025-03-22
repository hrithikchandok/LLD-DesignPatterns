package StateDesignPattern;

public class YellowLightState implements TrafficLightState{
    @Override
    public void change(TrafficLight context) {
        System.out.println("Yellow light");
        context.change(new GreenLightState());
    }
}
