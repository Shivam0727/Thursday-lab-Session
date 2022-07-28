//Q-3: Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;
class PositiveNegative
	{
 	    public static void main (String[]args)
 	   { 
    			Scanner sc = new Scanner(System.in);
    		        System.out.println ("Enter the number : ");
	        	int num = sc.nextInt();

   	   if (num > 0) 
		{
       			 System.out.println ("The number is positive");
		}
   	   else if (num < 0)
		{
        System.out.println ("The number is negative");
		}
   	 else
		{
        System.out.println ("Zero");
		}
 	     }
	 }