package learning;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}

public class DigitalLibraryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Book> books = new ArrayList<>();
    private static boolean isAdminLoggedIn = false;

    public static void main(String[] args) {
        // Pre-added books
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));

        while (true) {
            System.out.println("\nWelcome to Digital Library Management System");
            System.out.println("1. Admin Login");
            System.out.println("2. User Access");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> adminLogin();
                case 2 -> userAccess();
                case 3 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminLogin() {
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if ("admin123".equals(password)) { // Default password
            isAdminLoggedIn = true;
            System.out.println("Admin login successful!");
            adminMenu();
        } else {
            System.out.println("Incorrect password.");
        }
    }

    private static void adminMenu() {
        while (isAdminLoggedIn) {
            System.out.println("\nAdmin Menu");
            System.out.println("1. Add New Book");
            System.out.println("2. Delete Book");
            System.out.println("3. View All Books");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> deleteBook();
                case 3 -> viewBooks();
                case 4 -> {
                    System.out.println("Logging out...");
                    isAdminLoggedIn = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    private static void deleteBook() {
        System.out.print("Enter Book Title to Delete: ");
        String title = scanner.nextLine();
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Book deleted successfully!");
    }

    private static void viewBooks() {
        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void userAccess() {
        while (true) {
            System.out.println("\nUser Menu");
            System.out.println("1. View All Books");
            System.out.println("2. Search for a Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Email Support");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> viewBooks();
                case 2 -> searchBook();
                case 3 -> issueBook();
                case 4 -> returnBook();
                case 5 -> emailSupport();
                case 6 -> {
                    System.out.println("Exiting user access...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void searchBook() {
        System.out.print("Enter Book Title to Search: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void issueBook() {
        System.out.print("Enter Book Title to Issue: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available for issuing.");
    }

    private static void returnBook() {
        System.out.print("Enter Book Title to Return: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or wasn't issued.");
    }

    private static void emailSupport() {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your query: ");
        String query = scanner.nextLine();
        System.out.println("Thank you for reaching out! Our team will respond to " + email + " shortly.");
    }
}
