public class Main
{
	public static void main(String[] args) 
	{
	   StudentA a = new StudentA(70, 50, 100);
           System.out.println("The percentage of Student A is : "+a.getPercentage()+" %");
           StudentB b = new StudentB(90, 75, 64, 86);
           System.out.println("The percentage of Student B is : "+b.getPercentage()+" %");
	}

}

abstract class  Marks
	 {
		 public abstract float getPercentage();
	 }

	class StudentA extends Marks
	{
		   int marks1, marks2, marks3;
		   StudentA(int m1, int m2, int m3)
		{
	           marks1=m1;
	           marks2=m2;
	           marks3=m3;
        	}

	   public float getPercentage()
		{
		       float total=((marks1+marks2+marks3)/(float)300)*100;
		       return total;
	        }
	}

	class StudentB extends Marks
	{
		 int marks1, marks2, marks3, marks4;
        	 StudentB(int m1, int m2, int m3, int m4)
		{
		       marks1=m1;
		       marks2=m2;
		       marks3=m3;
		       marks4=m4;
	        }

  	 public float getPercentage()
		{
		       float total=((marks1+marks2+marks3+marks4)/(float)400)*100;
		       return total;
   		}

	}