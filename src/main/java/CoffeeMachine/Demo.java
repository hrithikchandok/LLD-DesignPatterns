package CoffeeMachine;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Bevrages.Capachino;
import CoffeeMachine.Bevrages.Expresso;
import CoffeeMachine.Decorator.MilkDecorator;

public class Demo {
    public static void main(String[] args) {
        CoffeeMchn mchn= CoffeeMchn.getInstance();
        Inventory inv= Inventory.getInstance();
        mchn.setInventory(inv);
        mchn.intializeInventory();
        Beverages bw=new Expresso(inv);
        Beverages newone = new MilkDecorator(bw, inv);
        System.out.println(newone.getName()+" -> "+newone.getPrice());
    }
}
