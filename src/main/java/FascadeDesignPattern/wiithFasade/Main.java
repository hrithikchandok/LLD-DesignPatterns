package FascadeDesignPattern.wiithFasade;

public class Main {
    public static void main(String[] args){
        MovieBookFascade movieBookFascade = new MovieBookFascade();
        movieBookFascade.bookMovie();
    }
}
