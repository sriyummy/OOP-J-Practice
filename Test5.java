class Test5
{
    public static void main(String[] args)
	{
        try
		{
            int a = args.length;
            int d = 50/a;
            try
			{
                if (a == 1)
				{
                    a = a / (a - a);
                }
                if (a == 2)
				{
                    int[] x = {1};
                    x[5] = 10;
                }
            }
			catch (ArrayIndexOutOfBoundsException e)
			{
                System.out.println(e);
            }
        }
		catch (ArithmeticException e)
		{
            System.out.println(e);
        }
    }
}