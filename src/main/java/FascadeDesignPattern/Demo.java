package FascadeDesignPattern;

public class Demo{

    // client code
    // three Subsyetmt are needed for movie booking
    public static void main(String[] args){

        MovieSystem movieSystem = new MovieSystem();
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        User user =new User("hrithik","hrithikchandok@gmail.com","701726292626");

        if(movieSystem.isAvailable("stree2"))
        {
            ticketBookingSystem.createTicket(user.getEmail(),"Stree2",700);
            paymentSystem.cardPayment();

        }
        }
}
