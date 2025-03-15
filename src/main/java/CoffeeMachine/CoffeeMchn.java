package CoffeeMachine;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Bevrages.Capachino;
import CoffeeMachine.Bevrages.Expresso;

import java.util.List;

public class CoffeeMchn
{
    private static CoffeeMchn instance;
     Inventory inventory;
    State state;
    List<Beverages> li;
    private CoffeeMchn(){}

//    public static Inventory getInventory() {
//        return inventory;
//    }

    public  void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    void getList()
    {
        li.add(new Expresso(inventory));
        li.add(new Capachino(inventory));
       li.stream().forEach((e)->System.out.println(e));
    }



    public static CoffeeMchn getInstance()
    {
        if(instance == null)
        {
            instance = new CoffeeMchn();
        }
        return instance;
    }

     void intializeInventory()
    {
        inventory.addStock(this,"coffee",5);
        inventory.addStock(this,"water",5);
        inventory.addStock(this, "milk",5);
        inventory.addStock(this, "sugar",5);
        inventory.addStock(this, "chocolate",5);
    }
    void removeStock(String item,int quantity)
    {
        inventory.removeStock(item,quantity);
    }
    void addStock(String item,int quantity)
    {
        inventory.addStock(this, item,quantity);
    }
}
