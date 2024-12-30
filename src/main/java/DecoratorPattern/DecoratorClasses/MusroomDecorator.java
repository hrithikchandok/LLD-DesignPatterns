package DecoratorPattern.DecoratorClasses;

import DecoratorPattern.BasePizza;

public class MusroomDecorator extends PizzaDecorator{
    private BasePizza basePizza;

    public MusroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int Cost() {
        return basePizza.Cost()+20;
    }
}
