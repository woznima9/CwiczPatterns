package moj.cwiczebny.pack.cinema;

public class Title1Ticket implements Ticket {
    private String seansTitle;
    private double priceTicket;
    private int projectionTime;
    private int cinemaHallNumber;


    Title1Ticket() {
        seansTitle = "Przeminęło z wiatrem";
        priceTicket = 11.10;
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
