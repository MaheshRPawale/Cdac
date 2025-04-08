package learning;
import java.util.*;

public class OnlineReservationSystem {
    private static final Map<String, String> userDatabase = new HashMap<>(); // Stores login credentials
    private static final Map<String, Reservation> reservations = new HashMap<>(); // Stores reservations by PNR
    private static int pnrCounter = 1000; // For generating unique PNR numbers

    static class Reservation {
        String name;
        String trainNumber;
        String trainName;
        String classType;
        String dateOfJourney;
        String from;
        String to;

        public Reservation(String name, String trainNumber, String trainName, String classType, String dateOfJourney, String from, String to) {
            this.name = name;
            this.trainNumber = trainNumber;
            this.trainName = trainName;
            this.classType = classType;
            this.dateOfJourney = dateOfJourney;
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "Passenger Name: " + name + "\n" +
                    "Train Number: " + trainNumber + "\n" +
                    "Train Name: " + trainName + "\n" +
                    "Class: " + classType + "\n" +
                    "Date of Journey: " + dateOfJourney + "\n" +
                    "From: " + from + "\n" +
                    "To: " + to;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding a default user
        userDatabase.put("admin", "password");

        System.out.println("Welcome to the Online Reservation System");

        if (!login(scanner)) {
            System.out.println("Exiting system. Goodbye!");
            return;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Reservation Form");
            System.out.println("2. Cancellation Form");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    makeReservation(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using the Online Reservation System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean login(Scanner scanner) {
        System.out.println("\nLogin Form:");
        System.out.print("Enter login ID: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userDatabase.containsKey(loginId) && userDatabase.get(loginId).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid login ID or password.");
            return false;
        }
    }

    private static void makeReservation(Scanner scanner) {
        System.out.println("\nReservation Form:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter train name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter class type (e.g., AC, Sleeper): ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey (dd/mm/yyyy): ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter departure station: ");
        String from = scanner.nextLine();
        System.out.print("Enter destination station: ");
        String to = scanner.nextLine();

        String pnr = "PNR" + (++pnrCounter);
        reservations.put(pnr, new Reservation(name, trainNumber, trainName, classType, dateOfJourney, from, to));

        System.out.println("\nReservation successful!");
        System.out.println("Your PNR number is: " + pnr);
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.println("\nCancellation Form:");
        System.out.print("Enter your PNR number: ");
        String pnr = scanner.nextLine();

        if (reservations.containsKey(pnr)) {
            System.out.println("\nReservation Details:");
            System.out.println(reservations.get(pnr));
            System.out.print("Are you sure you want to cancel this reservation? (yes/no): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("yes")) {
                reservations.remove(pnr);
                System.out.println("Reservation cancelled successfully.");
            } else {
                System.out.println("Cancellation aborted.");
            }
        } else {
            System.out.println("No reservation found with the given PNR number.");
        }
    }
}
