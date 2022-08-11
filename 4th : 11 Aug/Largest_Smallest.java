import java.util.Scanner;

public class Largest_Smallest
	{
		public static void main(String args[])
        		{
				int arr[] = { 50 , 12 , 1 , 97 , 34 , 72 };
			        int largest = arr[0]; 
				int smallest= arr[0];

				for(int i=0; i<arr.length; i++) 
				{
					 if(smallest > arr[i])
						{
              						smallest = arr[i];
						}
           				if(largest < arr[i])
						{
              						largest = arr[i];
						}
				}

       				System.out.println("Smallest Element in Array is : "+smallest);
       				System.out.println("Largest Element in Array is : "+largest);
   			}
	}