package SingleTonDesignPattern;

 enum EnumSingelton
{
    INSTANCE;

    public void getInstance()
    {
        System.out.println("Inside getInstance method");
    }
}
class Main
{
    public static void main(String[] args){
//        EnumSingelton instance = EnumSingelton.INSTANCE;
//        instance.getInstance();
        Thread t1=new Thread(()->System.out.println(EnumSingelton.INSTANCE+"->"+Thread.currentThread().getName()));
        Thread t2=new Thread(()->System.out.println(EnumSingelton.INSTANCE+"->"+Thread.currentThread().getName()));
        t1.start();
        t2.start();

    }
}

