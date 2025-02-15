package SingleTonDesignPattern.BreakSingeltonDesignPattern;

import java.lang.reflect.Constructor;

public class Reflextion
{
    public static void main(String[] args) {
        Early early = Early.getInstance();
        Class<Early> earlyClass = Early.class;
        Constructor<?>[] constructors = earlyClass.getConstructors();
        constructors[0].setAccessible(true);
        Early early1 = new Early();
        early1.getInstance();
        System.out.println(early1.hashCode());
        System.out.println(early.hashCode());


    }
}
