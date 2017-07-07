package designpatterns.singletonUsingEnum;

/**
 * Created by kumarris on 28/12/16.
 */
public class Consumer {

    public static void main(String[] args) {
        bookMyTicket("A1");
        bookMyTicket("B1");
        bookMyTicket("B2");
        bookMyTicket("B3");
        bookMyTicket("B1");

    }

    private static void bookMyTicket(String seatNumber) {
        ShowManager showManager = ShowManager.showManagerInstance;
        if (showManager.bookSeat(seatNumber))
            System.out.println("For "+seatNumber+" :Seat Booking Confirmed.");
        else
            System.out.println("For "+seatNumber+": "+seatNumber+ " is already booked. Select some other seat.");
    }
}
