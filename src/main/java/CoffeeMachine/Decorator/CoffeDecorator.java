package CoffeeMachine.Decorator;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Inventory;

public class CoffeDecorator extends BeveragesDecorator {

    public CoffeDecorator(Beverages beverages, Inventory inventory) {
        super(beverages, "coffee", 10, inventory);
    }
}
