/*Write a class Account containing acc_no, balance as data members and two methods as
input() for taking input from user and disp() method to display the details. Create a
subclass Person which has name and aadhar_no as extra data members and override disp()
function. Write the complete progrm to take and print details of threepersons.*/

import java.util.Scanner;

class Account
{
	private long acc_no;
	private float balance;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the account number: ");
		acc_no = sc.nextLong();
		
		System.out.println ("Enter the balance: ");
		balance = sc.nextFloat();
	}
	
	public void disp()
	{
		System.out.println ("Account Details: ");
		System.out.println ("Account Number: " + acc_no + "\n" + "Available Balance: " + balance);
	}
}

class Person extends Account
{
	String name;
	long aadhar_no;
	
	@Override
	public void disp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter your Aadhar Number: ");
		aadhar_no = sc.nextLong();
		System.out.println ("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println ("Additional Account Details: ");
		System.out.println ("Name: " + name + "\nAadhar Number: " + aadhar_no);
	}
}

public class Main4
{
	public static void main(String[] args)
	{
		Person[] persons = new Person[3];
		
		int i;
		
		for (i=0; i<3; i++)
		{
			System.out.println ("Enter details of person " + (i+1) + ":");
			persons[i] = new Person();
			persons[i].input();
		}
		
		for (i=0; i<3; i++)
		{
			System.out.println ("Details of person " + (i+1) + "are:");
			persons[i].disp();
		}
	}
}