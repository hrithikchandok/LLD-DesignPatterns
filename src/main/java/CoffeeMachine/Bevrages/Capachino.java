package CoffeeMachine.Bevrages;

import CoffeeMachine.Inventory;

import java.util.Map;

public class Capachino extends Beverages
{
    public Capachino(Inventory inventory)
    {
        super("Capachino",20,Map.of("water",1,"milk",2,"coffee",2),inventory);
    }
}
