package moj.cwiczebny.pack.cinema;

public class NachosDecorator implements Ticket {
    private Ticket ticket;

    public NachosDecorator(Ticket ticket) {
        this.ticket = ticket;
    }


    @Override
    public double priceTicket() {
        return 3.33;
    }

    @Override
    public String showTitle() {
        return null;
    }

    @Override
    public void prepare() {
        ticket.prepare();
        System.out.print("/ nachos ");

    }
}
