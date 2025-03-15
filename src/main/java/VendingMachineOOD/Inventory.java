package VendingMachineOOD;

public class Inventory
{
    ItemShelf[] inventory=null;

    // intialize inventory
    // add item
    // get Item By CodeNumber
    // updateSoldout


    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public Inventory(int ItemCount) {
        inventory = new ItemShelf[ItemCount];
        intialInventory();
    }
    public void intialInventory() {
        int n=inventory.length;
        int startCode=100;
        for(int i=0;i<n;i++) {
            ItemShelf itemShelf=new ItemShelf();
            itemShelf.code=startCode;
            itemShelf.item=null;
            itemShelf.soldOut=true;
            startCode++;
        }
    }
    public void addItem(int codeNumber, Item item)
    {
        for(int i=0;i<inventory.length;i++) {
            if(inventory[i].code==codeNumber) {
                inventory[i].item=item;
                inventory[i].soldOut=false;
            }
        }
    }

    public Item getItem(int code) throws Exception {
            for(int i=0;i<inventory.length;i++) {
                if(inventory[i].code==code&& inventory[i].soldOut!=false) {
                    return inventory[i].item;
                }
                else
                    throw new Exception("Item already soled");
            }
            return null;
    }
    public void updateSoldOut(int codeNumber)
    {
        for(int i=0;i<inventory.length;i++) {
            if(inventory[i].code==codeNumber) {
                inventory[i].soldOut=true;
            }
        }
    }



}
