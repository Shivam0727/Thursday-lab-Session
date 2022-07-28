/* Q-3: When i is casted to c the value corresponding to the ascii code of 81 which is 'Q' is assigned.
When d is casted to i the decimal part .142 is truncated and only 323 is assigned to i.
Similarly when f is casted to i, the decimal part .38 is truncated and only 72 is assigned to i.
When d is casted to b whose range is -128 to 127, not only the decimal part .142 is truncated but it is also shortened from 323 to 67 so as to fit in byte range.                                                                                                                                                                                                                                  "
i = 81 c = Q
d = 323.142 i = 323
f = 72.38 i = 72
d = 323.142 b = 67 */


class Cast
{
	public static void main(String[] args)
	{
		int A = 81;
		char A2 = (char)A;
		double D = 323.142d;
		int D2 = (int) D;
		float F1 = 72.38f;
		int F2 = (int) F1;
		byte D3 = (byte) D;

		System.out.println("char value of 81 = "+ A2);
		System.out.println("integer value of 323.142 = " + D2);
		System.out.println("integer value of 72.38 = " + F2);
		System.out.println("byte value of 323.142 = " + D3 ); 	
	}
}