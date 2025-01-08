package SingleTonDesignPattern;

import javax.swing.plaf.TableHeaderUI;

class ThreadSafeSingelton
{
    private static ThreadSafeSingelton instance;
    private ThreadSafeSingelton(){}
    public synchronized static  ThreadSafeSingelton   getInstance()
    {
        if(instance == null)
            instance = new ThreadSafeSingelton();
        return instance;
    }
}
public class ThreadSafe
{
    public static void main(String[] args){
        Thread th=new Thread(new Runnable(){
            public void run(){
                System.out.println("->"+ThreadSafeSingelton.getInstance()+Thread.currentThread().getName());
            }
        });

        Thread th2=new Thread(()->System.out.println("->"+ThreadSafeSingelton.getInstance()+Thread.currentThread().getName()));
        th.start();
        th2.start();

    }
}
