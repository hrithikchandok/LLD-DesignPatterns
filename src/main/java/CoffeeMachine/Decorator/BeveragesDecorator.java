package CoffeeMachine.Decorator;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Inventory;

import java.util.Map;

abstract class BeveragesDecorator extends Beverages {

    public BeveragesDecorator(Beverages beverages, String addOn, int cost, Inventory inventory)
    {
            super(beverages.name+" with "+addOn, beverages.price+cost,Map.of(addOn,1),inventory);
    }
}
