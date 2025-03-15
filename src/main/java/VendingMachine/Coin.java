package VendingMachine;

public enum Coin
{
    ONE(1),
    FIVE(5),
    TEN(10),
    HUNDERED(100);
    public int value;
    Coin(int value)
    {
        this.value = value;
    }
}
