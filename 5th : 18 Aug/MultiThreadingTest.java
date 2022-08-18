import java.util.Random;
class RandomNumberThread extends Thread 
{
	public void run() 
	{
		Random random = new Random();
		for (int i = 0; i < 5 ; i++) 
		{
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated : " + randomInteger);
			
			if((randomInteger%2) == 0) 
			{
				SquareThread sThread = new SquareThread(randomInteger);
				sThread.start();
			}
			else 
			{
				CubeThread cThread = new CubeThread(randomInteger);
				cThread.start();
			}
			try 
			{
				Thread.sleep(1000);
				
				System.out.println("--------------------------------------");
			} 
			catch (InterruptedException ex) 
			{
				System.out.println(ex);
			}
		}
	}
}

class SquareThread extends Thread 
{
	int number;

	SquareThread(int randomNumbern) 
	{
		number = randomNumbern;
	}

	public void run() 
	{
		System.out.println("It is a Square Thread as it is Even and Square of " + number + " is : " + (number * number));
	}
}

class CubeThread extends Thread 
{
	int number;

	CubeThread(int randomNumber) 
	{
		number = randomNumber;
	}

	public void run() 
	{
		System.out.println("It is a Cube Thread as it is Odd and Cube of " + number + " is : " + number * number * number);
	}
}

public class MultiThreadingTest 
	{
		public static void main(String args[]) 
		{
			RandomNumberThread rnThread = new RandomNumberThread();
			rnThread.start();
		}
	}