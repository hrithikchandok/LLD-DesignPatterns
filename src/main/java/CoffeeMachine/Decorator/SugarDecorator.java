package CoffeeMachine.Decorator;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Inventory;

public class SugarDecorator extends BeveragesDecorator {

    public SugarDecorator(Beverages beverages, Inventory inventory) {
        super(beverages, "sugar", 10, inventory);
    }
}
