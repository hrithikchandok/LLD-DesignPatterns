package DecoratorPattern;

public class MargeritaPizza extends BasePizza {
    void Description()
    {
        System.out.println("Margerita Pizza");
    }
    @Override
    public int Cost() {
       return 100;
    }
}
