package VendingMachine;

import java.util.List;

public class ItemShelf
{
   Item item;
   int code;
   boolean soldOut;

    public ItemShelf(Item item, boolean soldOut, int code) {
        this.item = item;
        this.soldOut = soldOut;
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
