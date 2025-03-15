package CoffeeMachine;

import java.util.HashMap;
import java.util.Map;

// Inventory Management
public class Inventory
{
    Map<String,Integer> stockInventory=new HashMap<>();
    private Inventory(){};
    public static Inventory instance;
    public static Inventory getInstance()
    {
        if(instance == null)
            instance = new Inventory();
        return instance;
    }

    void addStock(CoffeeMchn coffeeMchn, String item, int quantity) {
            stockInventory.put(item, stockInventory.getOrDefault(item, 0) + quantity);
    }
    Integer checkStock(String item)
    {
        return stockInventory.getOrDefault(item,0);
    }

    public void removeStock(String item, int quantity)
    {
            if(stockInventory.get(item) < quantity)
                throw new RuntimeException("Not enough stock");
            else
            stockInventory.put(item, stockInventory.getOrDefault(item, 0) - quantity);
    }

    public boolean isAvailable(String key, Integer value)
    {
        return stockInventory.getOrDefault(key, 0) >= value;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "stockInventory=" + stockInventory +
                '}';
    }

    public void useIngredient(String key, Integer value) {
        removeStock(key, value);
    }
}
