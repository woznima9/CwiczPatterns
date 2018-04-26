package moj.cwiczebny.pack.cinema;

public class Title3Ticket implements Ticket {
    @Override
    public double priceTicket() {
        return 33.30;
    }

    @Override
    public void prepare() {

    }

    @Override
    public String showTitle() {
        return "Trzecie tchnienie wiosny";

    }
}
