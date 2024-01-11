class Reverse
{
	public static void main(String args[])
	{
		int num = 8361;
		System.out.println ("Number is 8361");
		int temp = 0;
		int q = num%10;
		num = num/10;
		temp = temp*10 + q;
		q = num%10;
		num = num/10;
		temp = temp*10 + q;
		q = num%10;
		num = num/10;
		temp = temp*10 + q;
		q = num%10;
		temp = temp*10 + q;
		System.out.println ("Reverse is " + temp);
	}
}
		