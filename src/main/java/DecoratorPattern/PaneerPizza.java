package DecoratorPattern;

public class PaneerPizza extends BasePizza {
    void Description()
    {
        System.out.println("Paneer Pizza");
    }
    @Override
    public int Cost() {
        return 150;
    }
}
