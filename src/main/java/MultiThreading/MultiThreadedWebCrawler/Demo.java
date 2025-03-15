package MultiThreading.MultiThreadedWebCrawler;

import java.util.concurrent.*;

class WebCrawler implements Runnable{
    String url;
    WebCrawler(String url){
        this.url=url;

    }
    @Override
    public void run() {
         System.out.println("WebScrapping of this "+url+"is done by "+Thread.currentThread().getName());
    }
}
public class Demo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//         WebCrawler webCrawler = new WebCrawler();
         String Url[]={"google.com","gmail.com","leetcode.com","instagram.com"};
         ExecutorService executor = Executors.newFixedThreadPool(4);
         for(String url:Url)
         {
             Future<?> future = executor.submit(new WebCrawler(url));
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             future.get(3000, TimeUnit.SECONDS);
//             System.out.println("WebScrapping of this "+url+"is done by "+Thread.currentThread().getName());
//             if(future.isDone())
//                 f
         }
         executor.shutdown();

    }
}
