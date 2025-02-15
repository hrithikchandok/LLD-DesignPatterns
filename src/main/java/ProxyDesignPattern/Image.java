package ProxyDesignPattern;

public interface Image
{
    void display();
}
class RealImage implements Image {

    @Override
    public void display()
    {
     System.out.println("RealImage");
    }
}
// client will interact with Proxy Image
//UseCases of Proxy Pattern
//Caching
//Access Control
// Monitoring and Logging
//preprocesing and postprocessing
class ProxyImage implements Image {

    RealImage realImage;
    @Override
    public void display()
    {
        // Cached
       if(realImage == null)
       {
           System.out.println("Object Created");
           realImage = new RealImage();
       }
       realImage.display();
    }
}
