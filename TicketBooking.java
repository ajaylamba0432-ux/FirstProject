import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        boolean ch = true;
        Scanner sc = new Scanner(System.in);
        while (ch) {
            try {
                System.out.println("Press 1 for buying a ticket \nPress 2 for cancel a ticket \nPress 3 for exit");
                System.out.println("Enter Your choice");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter number of tickets");
                        int ticket = sc.nextInt();
                        if (ticket > 6) {
                            throw new Exception("Please buy ticket less than 6");
                        } else {
                            System.out.println("You succesfully buy " + ticket + " tickets");
                        }
                        break;
                    case 2:
                        System.out.println("Ticket is cancelled succesfully");
                        break;
                    case 3:
                        System.out.println("You exit succesfully");
                        ch = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
        System.out.println("Thank you for using our service");
    }
}