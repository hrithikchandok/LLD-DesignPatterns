package VendingMachineOOD;

public class ItemShelf {


        int code;
        Item item;
        boolean soldOut;

//    public ItemShelf(Item item, int code, boolean soldOut) {
//        this.item = item;
//        this.code = code;
//        this.soldOut = soldOut;
//    }

    public int getCode() {
            return code;
        }

        public void setCode(int code) {
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


}
