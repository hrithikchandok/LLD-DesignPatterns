package StateDesignPattern;

public class TrafficLight {
    TrafficLightState state;

    public TrafficLight() {
       state=new RedLightState();
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state){
        this.state=state;
    }

    void change(TrafficLightState state)
    {
        state.change(this);
    }



}
