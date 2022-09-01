class Parent 
{
	Parent()
	{
		System.out.println("Parent Class Constructor ...");
	}
}
public class Constructor_Overloading extends Parent
{
	Parent(int x)
	{
		int area = x ;
		System.out.println(area);
	}
	
	public static void main(String[] args) 
	{
		Constructor_Overloading obj = new Constructor_Overloading(20);
	}
}

	