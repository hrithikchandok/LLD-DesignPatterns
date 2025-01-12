package FascadeDesignPattern.wiithFasade;

import FascadeDesignPattern.MovieSystem;
import FascadeDesignPattern.PaymentSystem;
import FascadeDesignPattern.TicketBookingSystem;
import FascadeDesignPattern.User;

public class MovieBookFascade {

    void bookMovie()
    {
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
