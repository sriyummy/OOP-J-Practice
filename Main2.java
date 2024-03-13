/*Define an interface Motor with a data member -capacity and two methods such as
run() and consume(). Define a Java class Washing machine' which implements this
interface and write the code to check the value of the interface data member
thru an object of the class.*/

import java.util.Scanner;

interface Motor
{
	int capacity = 10;
	
	void run();
	void consume();
}

class WashingMachine implements Motor
{
	public void run()
	{
		System.out.println ("The washing machine is running.");
	}
	
	public void consume()
	{
		System.out.println ("The washing machine is consuming energy.");
	}
}

public class Main2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		WashingMachine wm = new WashingMachine ();
		
		wm.run();
		wm.consume();
		System.out.println ("The washing machine is running by consuming power of " + wm.capacity + " watts");
	}
}