class Test4
{
    public static void main(String[] args)
	{	
        try
		{
            int d, a;
            d = args.length;
            a = 15/d;
            int[] x = {1, 2, 3, 4};
            x[10] = 15;
            System.out.println("CSE");
        }
		catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println(e);
        }
		catch (Exception e)
		{
            System.out.println("Exception: " + e);
        }
    }
}