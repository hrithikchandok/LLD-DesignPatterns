package BuilderDesignPattern;
class Home{
    boolean walls;
    boolean parkinglot;
    boolean swimming;
    boolean lawn;

    public Home(boolean walls, boolean parkinglot, boolean swimming, boolean lawn){
       //
    }

}
class Home2
{
    boolean walls;
    boolean parkinglot;
    boolean swimming;
    boolean lawn;

    public Home2(boolean walls , boolean parkinglot)
    {

    }

    public Home2(boolean walls, boolean parkinglot, boolean swimming, boolean lawn){
        this(walls, parkinglot);// Telescope constructors
        this.swimming = swimming;
        this.lawn = lawn;
    }
}
public class WithoutBuilder {
    public static void main(String[] args){
        //client code

        Home home = new Home(true, false, false, false);
//      in this client only want to add the walls only but was forced to add other attribuites as well/**/
//      Have to add multiple constructo and makes our code heavy and lengthy

//      lengthy part can be solved with the help of telescope constructors



    }}
