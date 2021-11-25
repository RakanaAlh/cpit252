
import java.sql.Connection;

public class SupportSystem {

    public static void main(String[] args) throws ClassNotFoundException {

            //singleton implemented---------
        Connection conn = DBconnection.getInstance();
        System.out.println("Hi");
        
            //Facade implemented-----------
            TicketingFacade tickets = new TicketingFacade();
            
            //these options will be distinquished with more deeper methods that are yet to be implemented
            tickets.createTechTicket();
            tickets.createAccTicket();
            tickets.createPaymTicket();
            
    }

}
