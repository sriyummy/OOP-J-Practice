/*Write a Java class which has a method called ProcessInput().
This method checks the number entered by the user. If the entered
number is negative then throw an user defined exception called
NegativeNumberException, otherwise it displays the double value
of the entered number.*/

import java.util.Scanner;

class Except extends Exception
{
    int num;
    String mssg;

    Except(String mssg, int num)
	{
        this.num = num;
        this.mssg = mssg;
    }

    public String toString()
	{
        return "myException caught: " + mssg + " with value: " + num;
    }
}

class Main3
{
    static void ProcessInput(int x) throws Except
	{
        if (x < 0)
		{
            throw new Except("NegativeNumberException", x);
        }
		else
		{
            System.out.println("Positive Number!");
        }
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter a number to check if positive or negative: ");
        n = sc.nextInt();

        try
		{
            ProcessInput(n);
        }
		catch (Except e)
		{
            System.out.println(e);
        }
        sc.close();
    }
}
