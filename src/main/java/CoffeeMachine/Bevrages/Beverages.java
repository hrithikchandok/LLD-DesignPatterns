package CoffeeMachine.Bevrages;

import CoffeeMachine.Inventory;

import java.util.Map;

public abstract class Beverages {
    public String name;
    public Integer price;
    public Map<String, Integer> recipe;

    public Beverages(String name, Integer price, Map<String, Integer> recipe, Inventory inventory) {
        if (!canBeCreated(recipe, inventory)) {
            throw new IllegalArgumentException("Insufficient ingredients in inventory to create " + name);
        }
        this.name = name;
        this.price = price;
        this.recipe = recipe;
        useIngredients(recipe, inventory);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    //    public Beverages getBeverages() {
//        return this;
//    }

    private boolean canBeCreated(Map<String, Integer> recipe, Inventory inventory) {
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()+"-> inventory"+inventory.isAvailable(entry.getKey(), entry.getValue()));
            if (!inventory.isAvailable(entry.getKey(), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    private void useIngredients(Map<String, Integer> recipe, Inventory inventory) {
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            inventory.useIngredient(entry.getKey(), entry.getValue());
        }
    }
}
