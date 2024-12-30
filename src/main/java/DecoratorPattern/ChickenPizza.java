package DecoratorPattern;

public class ChickenPizza extends BasePizza {
    void Description()
    {

        System.out.println("Chicken Pizza");
    }
    @Override
    public int Cost() {
       return 180;
    }
}
