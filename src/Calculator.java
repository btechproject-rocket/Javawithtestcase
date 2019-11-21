import java.util.*;
public class Calculator {

	 public static int add(int a, int b) {
	        return a + b;
	    }
	     
	    public static int subtract(int a, int b) {
	        return a - b;
	    }
	    
	    public static int divide(int a, int b) 
	    {
	        return a/b;
	    }
	    
	    public static int multiply(int a, int b) 
	    {
	        return a*b;
	    }
	    
	    
	    
	    
	    public static void main(String args[]) throws Exception
	    {
	    	int sum=add(2,3);
	    	System.out.println(sum);
	    	
	    	int div=divide(2,2);
	    	System.out.println(div);
	    	
	    }
}


