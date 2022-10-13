package reverse;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayByMethod {

	public static void main(String[] args) {

        Integer [] a = {1,3,5,7,9}; 
        System.out.println("Original Array:" + Arrays.asList(a));
        reverse(a); 
        
	}
		 	    
		    static void reverse(Integer a[]) 
		    { 
		        Collections.reverse(Arrays.asList(a)); 
		        System.out.println("Reversed Array:" + Arrays.asList(a)); 
		    } 
		 

	}


