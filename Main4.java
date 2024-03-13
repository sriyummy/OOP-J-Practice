/*Write a program to create user defined exceptions called HrsException, MinException
and SecException. Create a class Time which contains data members hours, minutes,
seconds and a method to take a time from user which throws the user defined exceptions
if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0)*/

import java.util.Scanner;

class HrsException extends Exception
{
	public HrsException(String message)
	{
		super (message);
	}
}

class MinException extends Exception
{
	public MinException(String message)
	{
		super (message);
	}
}

class SecException extends Exception
{
	public SecException(String message)
	{
		super (message);
	}
}

class Time
{
	private int hrs, mins, secs;
	
	public void setTime() throws HrsException, MinException, SecException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter the number of hours, followed by the number of minutes and then the number of seconds: ");
		hrs = sc.nextInt();
		mins = sc.nextInt();
		secs = sc.nextInt();
		
		if (hrs < 0 || hrs >= 24)
		{
			throw new HrsException ("No. of hours should be between 0 and 24");
		}
		
		if (mins >= 60 || mins < 0)
		{
			throw new MinException ("No. of minutes should be between 0 and 60");
		}
		
		if (secs >= 60 || secs < 0)
		{
			throw new SecException ("No. of seconds should range between 0 and 60");
		}
	}
	
	public void displayTime()
	{
		System.out.println ("The entered time is: " + hrs + ":" + mins + ":" + secs);
	}
}

public class Main4
{
	public static void main (String args[])
	{
		Time t1 = new Time();
		
		try
		{
			t1.setTime();
			t1.displayTime();
		}
		catch (HrsException | MinException | SecException e)
		{
			System.out.println ("Please enter corrrect time format: " + e.getMessage());
		}
	}
}