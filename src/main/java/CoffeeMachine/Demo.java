package CoffeeMachine;

import CoffeeMachine.Bevrages.Beverages;
import CoffeeMachine.Bevrages.Capachino;
import CoffeeMachine.Bevrages.Expresso;
import CoffeeMachine.Decorator.MilkDecorator;
import CoffeeMachine.Decorator.SugarDecorator;

public class Demo {
    public static void main(String[] args) {
        CoffeeMchn mchn= CoffeeMchn.getInstance();
        Inventory inv= Inventory.getInstance();
        mchn.setInventory(inv);
        mchn.intializeInventory();
        System.out.println(inv.toString());
        Beverages bw=new Expresso(inv);
        Beverages newone = new SugarDecorator(new MilkDecorator(bw, inv),inv);
        System.out.println(newone.getName()+" -> "+newone.getPrice());
        System.out.println(inv.toString());
    }
}
