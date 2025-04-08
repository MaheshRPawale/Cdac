package Array;
import java.util.Arrays;

public class RepeatingElements {
    public static void main(String[] args) {
        
    	
    	int arr[]= {11,2,23,4,3,3,3,2,11,45,55,55,55,55,55,55};
    	
    	boolean []visited=new boolean[arr.length];
        System.out.println("Array: " + Arrays.toString(arr));
    	  System.out.println("Repeating elements and their counts:");
    	  
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  if(visited[i])
    		  {
    			  continue;
    			  
    		  }
    		  int count=1;
    		  for(int j=i+1;j<arr.length;j++)
    		  {
    			  if(arr[i]==arr[j])
    			  {
    				  count++;
    				  visited[j]=true;
    			  }
    		  }
    		  
    		  if(count>1)
    		  {
    			  System.out.println(arr[i]+" "+count+"times");
    		  }
    		  
    	  }
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
