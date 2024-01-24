class OddEven
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		int num5 = Integer.parseInt(args[4]);
		int num6 = Integer.parseInt(args[5]);
		int num7 = Integer.parseInt(args[6]);
		int num8 = Integer.parseInt(args[7]);
		int num9 = Integer.parseInt(args[8]);
		int num10 = Integer.parseInt(args[9]);
		
		int odd=0, even=0;
		
		for (int i=0; i<10; i++)
		{
			if (Integer.parseInt(args[i])%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println ("Number of odd numbers:even numbers are- " + odd + ":" + even);
	}
}