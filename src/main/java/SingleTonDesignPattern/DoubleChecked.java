package SingleTonDesignPattern;
class DoubledCheckedLocking
{
    private static  volatile DoubledCheckedLocking instance;

    private DoubledCheckedLocking(){}

    public static DoubledCheckedLocking  getInstance()
        {
            if(instance == null)
            {
                synchronized (DoubledCheckedLocking.class) {
                    if(instance == null)
                        instance = new DoubledCheckedLocking();

                }
            }
            return instance;
        }

}

public class DoubleChecked {
    public static void main(String[] args){

        Thread th=new Thread(()->System.out.println(DoubledCheckedLocking.getInstance()+"->"+Thread.currentThread().getName()));
        Thread th2=new Thread(()->System.out.println(DoubledCheckedLocking.getInstance()+"->"+Thread.currentThread().getName()));

        th.start();
        th2.start();

    }
}
