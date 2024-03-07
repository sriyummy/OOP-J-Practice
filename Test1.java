import java.util.Scanner;

class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int d, a;
			d = sc.nextInt();
			a = 42/d;
		}
		catch (ArithmeticException e)
		{
			System.out.println ("Exception: "+ e);
		}
	}
}