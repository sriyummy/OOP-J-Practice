/*Write a program in Java having three classes Apple, Banana and Cherry. Class Banana and Cherry
are inherited from class Apple and each class have their own member function show().
Using Dynamic Method Dispatch concept display all the show() method of each class.*/

class Apple
{
	public void show()
	{
		System.out.println ("This is an Apple!");
	}
}

class Banana extends Apple
{
	public void show()
	{
		System.out.println ("This is a Banana!");
	}
}

class Cherry extends Apple
{
	public void show()
	{
		System.out.println ("This is a Cherry!");
	}
}

public class Main3
{
	public static void main(String[] aargs)
	{
		Apple ap1 = new Cherry();
		Apple ap2 = new Banana();
		
		ap1.show();
		ap2.show();
	}
}