package SingleTonDesignPattern.BreakSingeltonDesignPattern;

import javax.xml.stream.util.XMLEventAllocator;
import java.io.IOException;
import java.io.Serializable;

public class Early implements Serializable
{
    private static Early instance =new Early();
    private  void Early(){

    }
    public static Early getInstance(){
        return instance;
    }

//    Ensures singleton doesnt break
//    protected Object readResolve() {
//        return instance;
//    }
}
