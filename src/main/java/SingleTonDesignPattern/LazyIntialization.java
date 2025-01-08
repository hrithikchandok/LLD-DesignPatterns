package SingleTonDesignPattern;
class LazySingelton{
    private static LazySingelton instance;
    private LazySingelton(){

    }
    public static LazySingelton getInstance(){
        if(instance == null){
            instance = new LazySingelton();
        }
        return instance;
    }
}
public class LazyIntialization {
    public static void main(String[] args){
     LazySingelton instance = LazySingelton.getInstance();
     System.out.println(LazySingelton.getInstance().toString());
     System.out.println(LazySingelton.getInstance().toString());
    }
}
