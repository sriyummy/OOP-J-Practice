/*Write a Java program to handle an ArithmeticException using try,
catch, and finally block.*/

public class Main2
{
    public static void main(String[] args)
	{
        try
		{
            int a, b;
            a = 10;
			b = 0;
			b = a/b;
            
			System.out.println("Result: " + b);
        }
		catch(ArithmeticException e)
		{
            System.out.println("ArithmeticException caught: " + e);
        }
		finally
		{
            System.out.println("Inside Finally");
        }
    }
}
