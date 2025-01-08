package SingleTonDesignPattern;

class Billpugh
{

    private Billpugh(){}
    private  static class SingeltonHelper{
        private static Billpugh instance=new Billpugh();
    }

     public static Billpugh getInstance()
     {
         return SingeltonHelper.instance;
     }
}
public class BillPughSingelton
{
    public static void main(String[] args){

        System.out.println(Billpugh.getInstance());
        Thread t1=new Thread(()->System.out.println(Thread.currentThread().getName()+"->"+Billpugh.getInstance()));
        Thread t2=new Thread(()->System.out.println(Thread.currentThread().getName()+"->"+Billpugh.getInstance()));
        t1.start();
        t2.start();


    }
}
