
@FunctionalInterface
interface Fact
{
	abstract int Display(int n);
}
public class Factorial 
{

	public static void main(String[] args)
	{
		Fact obj=(n)->
		{

			int fact = 1 ;
			for(int i=1 ; i<= n ; i++ )
			{
				fact=fact*i;
			}
			return fact ;
		};
		System.out.println("Factorial : " +obj.Display(5));
	}

}