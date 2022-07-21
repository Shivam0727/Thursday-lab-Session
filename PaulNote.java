/* Q-1: Paul has bought a new notebook of "idol" brand, with a processor speed of 2.66GHz, 8 GB of RAM, 500GB hard disk, 
with a 15-inch monitor, for $1760.55. He has chosen service plan 'C' among plans 'A', 'B', 'C', and 'D', 
plus on-site servicing but did not choose extended warranty. Identify the data types and name the variables. */

class PaulNote
{		
	public static void main(String[] args)
	
	{
		String brand = "idol";
		float speed = 2.66f; 
		byte RAM = 8; 
		short memory = 500; 
		byte monitor = 15; 
		char service_plan = 'C'; 
		boolean on_site_service = true;
		boolean ext_warranty = false;
		float cost = 1760.55f; 

		System.out.println("SPECIFICATIONS OF NOTEBOOK : ");
		System.out.println("Brand = "+ brand + "(Data type = String )");
		System.out.println("Speed = "+ speed + " GHz"  + "(Data type = Float)");
		System.out.println("RAM = " + RAM + " GB"  + "(Data type = Byte)");
		System.out.println("Memory = "+ memory+ " GB"  + "(Data type = Short )");
		System.out.println("Monitor = " + monitor + " inch"  + "(Data type = Byte)");
		System.out.println("Service Plan = "+ service_plan  + "(Data type = Char)");
		System.out.println("On-Site Servicing = "+ on_site_service  + "(Data type = Boolean )");
		System.out.println("Extended Warranty = "+ ext_warranty  + "(Data type = Boolean)");
		System.out.println("Cost = "+ cost + "$"  + "(Data type = Float)");	

	}	
}