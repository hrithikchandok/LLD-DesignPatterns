package CoffeeMachine.Bevrages;

import CoffeeMachine.Inventory;

import java.util.Map;

public class Expresso extends Beverages
{
    public Expresso(Inventory inventory)
    {
        super("Capachino",20,Map.of("water",1,"milk",2,"coffee",2),inventory);
    }
}
