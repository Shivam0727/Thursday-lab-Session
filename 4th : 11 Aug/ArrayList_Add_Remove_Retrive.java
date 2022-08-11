import java.util.*;
class ArrayList_Add_Remove_Retrive
	{
        	public static void main(String[] args)
        	{
                	ArrayList<String> al = new ArrayList<String>();
                	System.out.println("Size of ArrayList: "+al.size());
               
                	al.add("C");
                	al.add("C++");
                	System.out.println("Elements of first ArrayList: "+al);

                	ArrayList<String> al2 = new ArrayList<String>();
                	al2.add("JAVA");
                	al2.add("PYTHON");

                	//Adding the both array
                	al2.addAll(al);
                	System.out.println("Elements of second ArrayList: "+al2);
                
			//remove the element
                	al2.remove("JAVA");
                	System.out.println("Elements of ArrayList after deletion: "+al2);
                	System.out.println("Size of ArrayList: "+al2.size());

                	//Retriving 2nd index element
                	System.out.println("The element at 2nd index is: "+al2.get(2));
        }
}