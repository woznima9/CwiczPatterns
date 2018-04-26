package moj.cwiczebny.pack.cinema;

public class TicketFactory {
    private static TicketFactory ticketFactory = null;

    private TicketFactory() {
    }

    public static TicketFactory getInstance() {
        if (ticketFactory == null) {
            ticketFactory = new TicketFactory();
        }
        return ticketFactory;
    }

    public Ticket createTicket(int titleNumber) {
        switch (titleNumber) {
            case 1:
                return new Title1Ticket();
            case 2:
                return new Title2Ticket();
            case 3:
                return new Title3Ticket();
            default:
                System.out.println("zły numer");


        }
        throw new RuntimeException("Invalid numer filmu");

    }

}
