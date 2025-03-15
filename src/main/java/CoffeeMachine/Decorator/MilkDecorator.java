package CoffeeMachine.Decorator;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Inventory;

public class MilkDecorator extends BeveragesDecorator {

    public MilkDecorator(Beverages beverages, Inventory inventory) {
        super(beverages, "milk", 10, inventory);
    }
}
