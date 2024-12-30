package DecoratorPattern;

import DecoratorPattern.DecoratorClasses.ExtraCheeseDecorator;
import DecoratorPattern.DecoratorClasses.MusroomDecorator;
import DecoratorPattern.DecoratorClasses.PizzaDecorator;

import java.sql.SQLOutput;

public class PizzaStore {
    public static void main(String[] args){

        BasePizza basePizza = new ExtraCheeseDecorator(new ChickenPizza());
        System.out.println(basePizza.Cost());
        BasePizza NewCombo= new MusroomDecorator(new ExtraCheeseDecorator(new ChickenPizza()));
        System.out.println(NewCombo.Cost());

    }
}
