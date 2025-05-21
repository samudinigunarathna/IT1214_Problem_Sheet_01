class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getSeatNumber() {
        return seatNumber;

    public String toString() {
        return "Ticket #" + ticketNumber + " | Customer: " + customerName + " | Seat: " + seatNumber;
    }
}

class BookingSystem {
    private Ticket[] tickets;
    private int ticketCount;

    public BookingSystem() {
        tickets = new Ticket[10]; // Max 10 seats
        ticketCount = 0;
    }

class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    
    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String toString() {
        return "Ticket #" + ticketNumber + " | Customer: " + customerName + " | Seat: " + seatNumber;
    }
}

class BookingSystem {
    private Ticket[] tickets;
    private int ticketCount;

    public BookingSystem() {
        tickets = new Ticket[10];
        ticketCount = 0;
    }

    public void bookTicket(int ticketNumber, String customerName, int seatNumber) {
        if (ticketCount >= tickets.length) {
            System.out.println("All seats are booked.");
            return;
        }

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number");
            return;
        
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].getSeatNumber() == seatNumber) {
                System.out.println("Seat " + seatNumber + " is already booked.");
                return;
            }
        }

        tickets[ticketCount] = new Ticket(ticketNumber, customerName, seatNumber);
        ticketCount++;
        System.out.println("Ticket booked successfully for " + customerName + " at seat " + seatNumber + ".");
    }

    public void cancelTicket(int ticketNumber) {
        
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].getTicketNumber() == ticketNumber) {
                
                for (int j = i; j < ticketCount - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[ticketCount - 1] = null;
                ticketCount--;
                System.out.println("Ticket #" + ticketNumber + " has been cancelled.");
                break;
            }
               }
        }
        if (!found) {
            System.out.println("Ticket #" + ticketNumber + " not found.");
        }
    }

    public void displayTickets() {
        System.out.println("\nCurrent Bookings:");
        if (ticketCount == 0) {
            System.out.println("No tickets booked.");
            return;
        }
        for (int i = 0; i < ticketCount; i++) {
            System.out.println(tickets[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookingSystem cinema = new BookingSystem();

        cinema.bookTicket(1, "Alice", 1);
        cinema.bookTicket(2, "Bob", 2);
        cinema.bookTicket(3, "Carol", 3);

        cinema.cancelTicket(2);

        cinema.bookTicket(4, "David", 2);

        cinema.displayTickets();
    }
}