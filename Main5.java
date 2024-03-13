/*Create an user defined exception named CheckArgument to  check the number of
arguments passed through command line. If the number of arguments is less than
four then throw the Check Argument exception, else print the addition of squares
of all the four elements.*/

class CheckArgument extends Exception
{
	public CheckArgument(String message)
	{
		super (message);
	}
}

class CommandLineCheck
{
	public void sumOfSquares (String args[]) throws CheckArgument
	{
		if (args.length < 4)
		{
			throw new CheckArgument ("Number of arguements is less than 4!");
		}
		else
		{
			int sum = 0;
			for (int i=0; i<args.length; i++)
			{
				int num = Integer.parseInt(args[i]);
				sum = sum + (num*num);
			}
			System.out.println ("Sum of elements: " + sum);
		}
	}
}

class Main5
{
	public static void main (String args[])
	{
		CommandLineCheck clc = new CommandLineCheck();
		try
		{
			clc.sumOfSquares(args);
		}
		catch (CheckArgument e)
		{
			System.out.println (e.getMessage());
		}
	}
}
			