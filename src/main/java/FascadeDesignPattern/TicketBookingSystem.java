package FascadeDesignPattern;

public class TicketBookingSystem {
    String user_email;
    String movie;
    int price;

    public void createTicket(String user_email, String movie, int price)
    {
        System.out.println("Creating a new ticket");
        System.out.println(movie+" Ticket Created Successfully for "+user_email);
    }

}
