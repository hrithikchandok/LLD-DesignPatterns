package ProxyDesignPattern;

public class Main
{
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage();
        proxyImage.display();
        proxyImage.display(); //cached
        proxyImage.display(); //cached
    }
}
