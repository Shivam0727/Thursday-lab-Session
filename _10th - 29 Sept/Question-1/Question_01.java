import java.util.Scanner;

class Question_01
{
    public static int count(int[] array, int n, int sum)
    {
        if (sum == 0) 
        {
            return 1;
        }
        if (sum < 0 || n < 0) 
        {
            return 0;
        }
        int x = count(array , n, sum - array[n]);
        int y = count(array , n - 1, sum);

        return x + y ;
    }
    public static void main(String[] args)
    {
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Sum : ");
    	int sum = sc.nextInt() ;
    	System.out.print("Enter Size Of Array (N) : ");  
    	n=sc.nextInt();  
    	int[] array = new int[n];  
    	System.out.print("Enter The Currency In RS In The Form Of Array : ");  
    	for(int i=0; i<n; i++)  
    	{  
    		array[i]=sc.nextInt();  
    	}    
        System.out.print("The total number of ways to get the desired Sum is : " + count(array, array.length - 1, sum));
    }
}