package moj.cwiczebny.pack.cinema;

import java.util.Scanner;

public class ChargeSeansInCinemaApp {
    public static void main(String[] args) {
        printRepertuar();

        TicketFactory ticketFactory = TicketFactory.getInstance();
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = ticketFactory.createTicket(scanner.nextInt());
        double priceSeans = ticket.priceTicket();
        String titleSeans = ticket.showTitle();
        System.out.println("Cena biletu na \"" + titleSeans + "\" " + priceSeans + " PLN");

        printPrzekaski();
        int choice = scanner.nextInt();
        int iloscDodatkow = 0;
        while (choice != 4) {
            switch (choice) {
                case 1:
                    ticket = new PopcornDecorator(ticket);
                    break;
                case 2:
                    ticket = new ColaDecorator(ticket);
                    break;
                case 3:
                    ticket = new NachosDecorator(ticket);
                    break;
                default:
                    System.out.println("na drugi raz podawaj prawidłowe liczby od 1 do 4 - KONIEC");
                    return;
            }
            iloscDodatkow++;
            priceSeans += ticket.priceTicket();
            System.out.println("Aktualna cena z uwzględnieniem dodatku :" + priceSeans + " PLN\n");
            printPrzekaski();
            choice = scanner.nextInt();
        }

        System.out.print("Do zapłaty za bilet na \"" + titleSeans + "\"");
        if (iloscDodatkow > 0) {
            System.out.print(" wraz z dodatkami: ");
        }
        ticket.prepare();

        Double d = new Double(priceSeans);
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);


        System.out.println("\n" + df.format(d) + " PLN");
        if (iloscDodatkow > 2) {
            int rabat = 5;

            Double dd = new Double(priceSeans * (100 - rabat) / 100);
            System.out.println("Ponieważ wybrałeś minimum 3 dodatki naliczono rabat w wysokości " + rabat + " %");
            System.out.println("Ostatecznie do zapłaty: " + df.format(dd) + " PLN");
        }
    }

    private static void printRepertuar() {
        System.out.println("KASA - wybierz bilet na seans");
        System.out.println("1. Przeminęło z wiatrem ");
        System.out.println("2. Zdobywcy kosmosu ");
        System.out.println("3. Trzecie tchnienie wiosny ");
    }

    private static void printPrzekaski() {
        System.out.println("\nWybierz przekąski:");
        System.out.print("1. Popcorn 1.11 PLN\t\t");
        System.out.print("2. Cola 2.22 PLN\t\t");
        System.out.print("3. Nachos 3.33 PLN\t\t");
        System.out.print("4. End\n");
    }
}
