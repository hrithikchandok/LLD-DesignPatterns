package DecoratorPattern.DecoratorClasses;

import DecoratorPattern.BasePizza;

public class ExtraCheeseDecorator extends PizzaDecorator{
    private BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int Cost() {
        return basePizza.Cost()+10;
    }
}
