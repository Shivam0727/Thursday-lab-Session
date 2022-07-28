class EmployeeInfo
{
	String Name;
	int Year;
	String Address;
	
	EmployeeInfo(String Name,int year, String Address)
		{
			 this.Name=Name;
			 this.Year=Year;
			 this.Address=Address;
	        }

	void Employee1()
	{
	    System.out.println(Name+"         "+   Year +"            	  "+Address);                                          
	}
	void Employee2()
	{
            System.out.println(Name+"         "+   Year +"            	  "+Address);                                          
	}
	void Employee3()
	{
	    System.out.println(Name+"         "+   Year +"            	  "+Address);                                          
	}
}

class EmployeeDetails
{
	public static void main(String args[])
	{
		 System.out.println("Name" +   "  Year of Joining     " + "Address" );
		 EmployeeInfo e=new EmployeeInfo("Sam",2000, "68D-WallsStreet");
		 e.Employee1();
		 EmployeeInfo e1=new EmployeeInfo("Robert",1994, "64C-WallsStreet");
		 e1.Employee2();
		 EmployeeInfo e2=new EmployeeInfo("John",1999, "26B-WallsStreet");
		 e2.Employee3();
	}

}