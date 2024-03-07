class myException extends Exception
{
	String s;
	int a;

	myException (String s, int a)
	{
		this.s = s;
		this.a = a;
	}
	
	public String toString()
	{
		return "myException caught: " + s + " with value: " + a;
	}
}

class Test6
{
	static void compute (int x) throws myException
	{
		if(x<0)
		{
			throw new myException ("Negative Number", x);
		}
		else
		{
			System.out.println ("Positive Number");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			compute(-5);
			compute(10);
		}
		catch(myException e)
		{
			System.out.println (e);
		}
	}
}
