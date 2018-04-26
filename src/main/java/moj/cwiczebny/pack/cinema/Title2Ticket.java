package moj.cwiczebny.pack.cinema;

public class Title2Ticket implements Ticket {
    private String seansTitle;
    private double priceTicket;
    private int projectionTime;
    private int cinemaHallNumber;

    Title2Ticket() {
        seansTitle = "Zdobywcy kosmosu";
        priceTicket = 22.22;
    }

    @Override
    public double priceTicket() {
        return priceTicket;
    }

    @Override
    public String showTitle() {
        return seansTitle;

    }

    @Override
    public void prepare() {

    }
}
