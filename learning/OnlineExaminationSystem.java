package learning;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OnlineExaminationSystem {
    private static final HashMap<String, String> users = new HashMap<>();
    private static String loggedInUser = null;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] questions = {
        "1. What is the capital of France?\n   a) Berlin\n   b) Madrid\n   c) Paris\n   d) Rome",
        "2. Which programming language is used for Android development?\n   a) Python\n   b) Java\n   c) C++\n   d) Swift"
    };
    private static final char[] answers = {'c', 'b'};

    public static void main(String[] args) {
        // Default user for testing
        users.put("user1", "password123");

        while (true) {
            System.out.println("\nWelcome to the Online Examination System");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> login();
                case 2 -> register();
                case 3 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            loggedInUser = username;
            System.out.println("Login successful!");
            showMainMenu();
        } else {
            System.out.println("Invalid credentials. Try again.");
        }
    }

    private static void register() {
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try again.");
            return;
        }
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println("Registration successful. You can now log in.");
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Update Profile and Password");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> updateProfile();
                case 2 -> startExam();
                case 3 -> {
                    System.out.println("Logging out...");
                    loggedInUser = null;
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void updateProfile() {
        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();
        users.put(loggedInUser, newPassword);
        System.out.println("Password updated successfully.");
    }

    private static void startExam() {
        System.out.println("The exam will begin now. You have 60 seconds.");
        char[] userAnswers = new char[questions.length];
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! Submitting your answers automatically...");
                gradeExam(userAnswers);
                timer.cancel();
                showMainMenu();
            }
        };
        timer.schedule(task, 60000);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            userAnswers[i] = scanner.nextLine().charAt(0);
        }

        timer.cancel();
        gradeExam(userAnswers);
    }

    private static void gradeExam(char[] userAnswers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++;
            }
        }
        System.out.println("Exam finished!");
        System.out.println("Your score: " + score + "/" + answers.length);
    }
}
