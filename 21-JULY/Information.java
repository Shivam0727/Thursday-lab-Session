/* Q-2: You are asked to develop a software for a college. The system shall maintain information about students. This includes name, address, phone number, gender, date of birth, height, weight, degree pursued (e.g., B.Sc., B.A.), year of study, average GPA, with/without tuition grant, is/is not a scholar. Each student is assigned a unique 8-digit number as id.
You are required to identify the variables, assign a suitable name to each variable and choose an appropriate type. Write the variable declaration statements as in the above example. */
public class Information
{
    public static void main (String[]args)
    {    
        String Name = "Shivam Barekar";
        String Address = "q.no. B/144 Kuchana Complex";
	String PhoneNo = "7038229942";
	String Gender = "Male";
	String DOB = "07/12/2000";
	float Height = 182.4f ;
	float weight = 76.5f;
	System.out.println("Information About Students : ");
	System.out.println("Name of the Student : " + Name);
	System.out.println("Address of the Student : " + Address);
	System.out.println("Phone Number of the Student : " + PhoneNo);
	System.out.println("Gender of the Student : " + Gender);
	System.out.println("Date of Birth of the Student : " + DOB);
	System.out.println("Height of the student : " + Height);
	System.out.println("weight of the Student : " + weight);

    }
}