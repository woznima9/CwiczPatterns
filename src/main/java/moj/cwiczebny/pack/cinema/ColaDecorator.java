package moj.cwiczebny.pack.cinema;

public class ColaDecorator implements Ticket {

    private Ticket ticket;

    public ColaDecorator(Ticket ticket) {
        this.ticket = ticket;
    }


    @Override
    public double priceTicket() {
        return 2.22;
    }

    @Override
    public String showTitle() {
        return "cola";
    }

    @Override
    public void prepare() {
        ticket.prepare();
        System.out.print("/ cola ");

    }
}
