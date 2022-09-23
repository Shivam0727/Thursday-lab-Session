import java.util.HashMap;
import java.util.Set;

public class Question_3 
{
	public void findIt(String str) 
	{
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) 
		{
			if (obj.containsKey(ch)) 
			{
				obj.put(ch, obj.get(ch) + 1);
			}
			else 
			{
				obj.put(ch, 1);
			}
		}
		Set<Character> keys = obj.keySet();
		for (Character ch : keys) 
		{
			if (obj.get(ch) > 1) 
			{
				System.out.println(ch + "  is " + obj.get(ch) + " times");
			}
		}
	}

	public static void main(String a[]) 
	{
		Question_3 duplicate = new Question_3();
		duplicate.findIt("Hello My Self Shivam Barekar . I Am From Nagpur , Maharastra .");
	}
}