package VendingMachineOOD;

import VendingMachineOOD.VendingState.Impl.IdleState;
import VendingMachineOOD.VendingState.States;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine{
    States state;
    Inventory inventory;
    List<Coin> coinList;

    public List<Coin> getCoinList() {
        return coinList;
    }

    public VendingMachine() {
        this.coinList = new ArrayList<>();
        this.inventory = new Inventory(10);
        this.state = (States) new IdleState();
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
