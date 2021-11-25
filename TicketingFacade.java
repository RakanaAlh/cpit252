
public class TicketingFacade {
    private Ticketing tech;
    private Ticketing acc;
    private Ticketing paym;

    public TicketingFacade() {
        tech = new TechnicalTickets();
        acc = new AccountTickets();
        paym = new PaymentTickets();    
    }
    
    public void createTechTicket(){
        tech.makeATicket();
    }
    public void createAccTicket(){
        acc.makeATicket();
    }
    public void createPaymTicket(){
        paym.makeATicket();
    }
    
}
