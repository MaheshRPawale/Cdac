package learning;

public class Diamond {

    public static void main(String[] args) {
    
        int n = 4;  // Number of rows for the upper half of the diamond
        
        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }
            // Printing stars
            for (int star = 0; star <= 2 * i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Printing spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }
            // Printing stars
            for (int star = 0; star <= 2 * i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
