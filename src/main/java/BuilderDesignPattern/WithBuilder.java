package BuilderDesignPattern;
class HomeB {
    private final boolean walls;
    private final boolean roof;
    private final boolean swiming;
    private final boolean parkinglot;
    private HomeB(HomeBuilder hm)
    {
        this.walls = hm.walls;
        this.roof = hm.roof;
        this.swiming = hm.swiming;
        this.parkinglot = hm.parkinglot;
    }

    @Override
    public String toString() {
        return "HomeB{" +
                "parkinglot=" + parkinglot +
                ", walls=" + walls +
                ", roof=" + roof +
                ", swiming=" + swiming +
                '}';
    }

    public static class HomeBuilder{
        boolean walls;
        boolean roof;
        boolean swiming;
        boolean parkinglot;
        HomeBuilder addwalls(boolean walls){
            this.walls=walls;
            return this;
        }
        HomeBuilder addroof(boolean roof){
            this.roof=roof;
            return this;
        }
        HomeBuilder addswiming(boolean swiming){
            this.swiming=swiming;
            return this;
        }
        HomeBuilder addparkinglot(boolean parkinglot){
            this.parkinglot=parkinglot;
            return this;
        }
        HomeB Build()
        {
            return new HomeB(this);
        }

    }
}

public class WithBuilder {
    public static void main(String[] args){
        HomeB.HomeBuilder homeBuilder = new HomeB.HomeBuilder();
        HomeB homeObj = homeBuilder.addwalls(true).addroof(true).Build();
        System.out.println(homeObj.toString());

    }
}
