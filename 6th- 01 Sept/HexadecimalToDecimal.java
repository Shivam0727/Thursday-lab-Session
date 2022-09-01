	
import java.io.*;
class HexadecimalToDecimal  
{
	static int hexadecimalToDecimal(String hex)
	{
		int length = hex.length();
		int base = 1;
		int decimalVal = 0;
		for (int i = length - 1; i >= 0; i--)
		{
			
			if (hex.charAt(i) >= '0'&& hex.charAt(i) <= '9')
			{
				decimalVal += (hex.charAt(i) - 48) * base;	
				base = base * 16;
			}

			
			else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') 
			{
				decimalVal += (hex.charAt(i) - 55) * base;
				base = base * 16;
			}
		}
		return decimalVal;
	}

	public static void main(String[] args)
	{
		String hexNumber = "7A";
		System.out.println("Decimal Convertion of Hexadecimal Value "+hexNumber+" is : "+hexadecimalToDecimal(hexNumber));
	}
}


