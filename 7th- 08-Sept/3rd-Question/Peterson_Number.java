import java.util.*;
class Peterson_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number (Input) : ");
		int n=sc.nextInt();
		int temp=n;
		int f=1,sum=0;
		while(n!=0)
		{
			f=1;
			int r=n%10;	
			for(int i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
		}
		System.out.println("Output : "+sum);
		if(sum==temp)
		System.out.println("As Input=Output Hence , PETERSON NUMBER");
		else
		System.out.println("As Input!=Output Hence , NOT PETERSON NUMBER");
	}
}
