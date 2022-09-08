import java.time.*;
import java.util.Scanner;


public class Age 
{
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Date-Of-Birth (yyyy-mm-dd) : ");
        String st = sc.nextLine();
        LocalDate DOB = LocalDate.parse(st);     
        System.out.println("Your Current Age :- "+calcAge(DOB));
    }
    
    static int calcAge(LocalDate DOB)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(DOB,currentDate).getYears();
        return age;
    }
}