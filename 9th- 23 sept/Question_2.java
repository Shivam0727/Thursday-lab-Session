
public class Question_2 
{

	public static void main(String[] args) 
	{
		int arr[] = { 80 , 30 , 90 , 60 , 10 , 50 , 20 , 70 , 40 , 100} ;
		int min=arr[0];
		int max=arr[0];
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int secMin = arr[0];
		int secMax = arr[0];
		for(int j = 0 ; j < arr.length ; j++)
		{
			if((arr[j]<secMin) && (arr[j]!=min))
			{
				secMin=arr[j];
			}
			if((arr[j]>secMax) && (arr[j]!=max))
			{
				secMax=arr[j];
			}
		}
		System.out.println("Second Maximum value of Array Element : "+secMax);
		System.out.println("Second Minimum value of Array Element : "+secMin);
	
	}
}
