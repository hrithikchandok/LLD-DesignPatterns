package SingleTonDesignPattern;

class EagerIntilizationSingelton
{
    private static final EagerIntilization INSTANCE = new EagerIntilization();
    private EagerIntilizationSingelton() {}
    public static  EagerIntilization getInstance()
    {
        return INSTANCE;
    }
}
public class EagerIntilization {
    public static void main(String[] args){
        System.out.println(EagerIntilizationSingelton.getInstance());
    }
}
