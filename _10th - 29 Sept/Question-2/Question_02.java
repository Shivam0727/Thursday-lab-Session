import java.util.Scanner;

class Question_02
{
	static void segregateElements(int arr[], int n)
	{
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] >= 0)
			{
				temp[j++] = arr[i];
			}
		}

		if (j == n || j == 0)
		{
			return;
		}
		for (int i = 0; i < n; i++)
		{
			if (arr[i] < 0)
			{
				temp[j++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++)
		{
			arr[i] = temp[i];
		}
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		System.out.print("Enter Size Of Array (N) = ");
		int n = sc.nextInt();
		int[] array = new int[n];  
    	System.out.print("Enter The Elements In Array : ");  
    	for(int i=0; i<n; i++)  
    	{  
    		array[i]=sc.nextInt();  
    	}    
		segregateElements(array, n);
		System.out.println("\nOutput : ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}


