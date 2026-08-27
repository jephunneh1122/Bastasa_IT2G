import java.util.Scanner;

public class Activity2 {

    public void cinemaTicket() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.println("Select Format:");
        System.out.println("1 - REGULAR");
        System.out.println("2 - 3D");
        System.out.println("3 - IMAX");

        System.out.print("Enter Selection: ");
        int select = sc.nextInt();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Enter movie time (24-hour format): ");
        int time = sc.nextInt();

        int ticketPrice = 0;
        String format = "";

        if (select == 1) {
            format = "REGULAR";
            ticketPrice = 350;

        } else if (select == 2) {
            format = "3D";
            ticketPrice = 400;

        } else if (select == 3) {
            format = "IMAX";
            ticketPrice = 450;

        } else {
            System.out.println("Selection not found.");
            return;
        }

        int peakCharge = 0;

        if (time >= 17 && time <= 20) {
            peakCharge = 50;
        }

        int totalPerTicket = ticketPrice + peakCharge;
        int totalCost = totalPerTicket * tickets;


        System.out.println();
        System.out.println("=== TICKET SUMMARY ===");
        System.out.println("Format: " + format);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Base Ticket Price: PHP " + ticketPrice);

        if (peakCharge > 0) {
            System.out.println("Peak Hour Charge: PHP " + peakCharge);
        } else {
            System.out.println("Peak Hour Charge: PHP 0");
        }

        System.out.println("Price Per Ticket: PHP " + totalPerTicket);
        System.out.println("TOTAL TICKET COST: PHP " + totalCost);
        System.out.println("STATUS: SEAT RESERVED");
    }
}
