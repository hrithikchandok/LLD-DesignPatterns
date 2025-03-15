package VendingMachine;

public class Item
{
    ItemType type;
    int price;

    Item(ItemType type, int price)
    {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
