package org.SOLID.LiskowSubstituions;

public class Demo {

    public static void main(String[] args) throws Exception {
        Bike bk;
        bk=new Bicycle();
        bk.startEngine();
    }
}

interface  Bike{
    void startEngine() throws Exception;
    void accelerate();
}
class MotorCycle implements Bike{

    @Override
    public void startEngine() {

    }

    @Override
    public void accelerate() {

    }
}
class Bicycle implements Bike{

    @Override
    public void startEngine() throws Exception {
         throw new Exception("Egnine is not there"); // Narrow down krdiya
    }

    @Override
    public void accelerate() {

    }
}

