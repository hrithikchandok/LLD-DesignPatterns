package CoffeeMachine.Decorator;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Inventory;

abstract class BeveragesDecorator extends Beverages {

    public BeveragesDecorator(Beverages beverages, String addOn, int cost, Inventory inventory)
    {
            super(beverages.name+" with "+addOn, beverages.price+cost, beverages.recipe,inventory);
    }
}
