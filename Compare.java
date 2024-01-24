import java.util.Scanner;

class Compare
{
	public static void main(String args[])
	{
		int num1, num2, num3, big=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter three numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1>=num2 && num1>=num3)
		{
			big = num1;
		}
		else if (num3>=num2 && num3>=num1)
		{
			big = num3;
		}
		else if (num2>=num3 && num2>=num1)
		{
			big = num2;
		}
		
		System.out.println ("The largest number is: " + big);
	}
}