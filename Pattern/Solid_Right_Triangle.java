package Pattern;

public class Solid_Right_Triangle {
    public static void main(String[] args) {
        int n = 8; 

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
              //  System.out.print("*");
                // if we want hollow then just used if-else condition 
                if(j==1|| i==n|| j==i)
                {
                	System.out.print("*");
                }
                else
                {
                	System.out.print(" ");
                }
                
            }
            System.out.println(); 
    }}
}
