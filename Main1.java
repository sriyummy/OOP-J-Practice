/*Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch
statement.*/

class Main1
{
	public static void main(String[] args)
	{
		try
		{
			int x[] = {1, 2, 3};
			x[5] = 15;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println ("Exception: " + e);
		}
	}
}
		