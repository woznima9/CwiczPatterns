package moj.cwiczebny.pack.cinema;

public class PopcornDecorator implements Ticket {

    private Ticket ticket;

    public PopcornDecorator(Ticket ticket) {
        this.ticket = ticket;
    }


    @Override
    public double priceTicket() {
        return 1.11;
    }

    @Override
    public String showTitle() {
        return "popcorn";
    }

    @Override
    public void prepare() {
        ticket.prepare();
        System.out.print("/ popcorn ");

    }
}
