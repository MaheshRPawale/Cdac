package Pattern;

public class Diamond_3 {
	public static void main(String[] args) {
		
		int i,j;
		int rows=5;
		 for(i=1; i<=rows; i++)
		    { 
		        // Print  spaces 
		        for(j=i; j<rows; j++)
		        {
		            System.out.print(" ");
		        }

		        // Print star 
		        for(j=1; j<=(2*i-1); j++)
		        {
		            System.out.print("*");
		        }

		        /* Move to next line */
		     System.out.println();		
		     
		    }

	}
}
