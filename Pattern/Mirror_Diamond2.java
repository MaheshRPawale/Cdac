package Pattern;

public class Mirror_Diamond2 {

	public static void main(String[] args) {
		
	int number=5;
		int count = 1;
	        for (int k = 1; k <= number - 1; k++) {
	            for (int i = 1; i <= count; i++) {
	                System.out.print("-");
	                }
	            count++;
	            for (int i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
	            
	            System.out.println();
	        }
		
	}
}
