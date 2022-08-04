import java.util.Scanner;
 class SearchArray
{
   	 public static int search(int arr[], int x)
   	 {
   	     int n = arr.length;
   	     for (int i = 0; i < n; i++)
   		     {
        		    if (arr[i] == x)
               	            return i;
       		     }
      	     return -1;
   	 }
 
   
   	 public static void main(String args[])
   	 {
        	int arr[] = { 2, 3, 4, 10, 40 };
		System.out.print("arr[] = { ");
		for(int i=0 ; i<5; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" }");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key for Search : ");
        	int x = sc.nextInt();
    
       	        int result = search(arr, x);
     	        if (result == -1)
       		{
		     System.out.print("Element is not present in array");
		}
       		 else
		{
            System.out.print("Element is present at index " + result);
		}
  	  }
}